package OperartingSystem.problem1;

// ProducerConsumerExample.java

class SharedBuffer {
    private int data;
    private boolean isEmpty = true;

    // Producer puts data into the buffer
    public synchronized void produce(int value) {
        while (!isEmpty) { // Wait if buffer is full
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        data = value;
        isEmpty = false;
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }

    // Consumer takes data from the buffer
    public synchronized int consume() {
        while (isEmpty) { // Wait if buffer is empty
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        isEmpty = true;
        System.out.println("Consumed: " + data);
        notify(); // Notify producer
        return data;
    }
}

// Producer Thread
class Producer extends Thread {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500); // Simulate production time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(800); // Simulate consumption time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Main Class
public class ConsumerProducerProblem1 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
