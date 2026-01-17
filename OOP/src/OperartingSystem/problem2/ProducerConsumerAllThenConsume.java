package OperartingSystem.problem2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

class SharedBuffer {
    private final List<Integer> buffer = new ArrayList<>();
    private final int capacity;
    private final Semaphore productionDone = new Semaphore(0);

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }


    public void produce(int value) {
        synchronized (this) {
            if (buffer.size() < capacity) {
                buffer.add(value);
                System.out.println("Produced: " + value);
            } else {
                System.out.println("Buffer full! Cannot produce more.");
            }
        }
    }

    public void consumeAll() {
        synchronized (this) {
            for (int value : buffer) {
                System.out.println("Consumed: " + value);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            buffer.clear();
        }
    }

    public void signalProductionDone() {
        productionDone.release(); //
    }

    public void waitForProduction() throws InterruptedException {
        productionDone.acquire(); //
    }
}

// Producer thread
class Producer extends Thread {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
                Thread.sleep(400);
            }
            buffer.signalProductionDone();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Consumer thread
class Consumer extends Thread {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            buffer.waitForProduction();
            buffer.consumeAll();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


public class ProducerConsumerAllThenConsume {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(10);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
