package OperartingSystem.ReaderWriter;
import java.util.concurrent.Semaphore;

class ReaderWriter {
    static Semaphore mutex = new Semaphore(1);
    static Semaphore wrt = new Semaphore(1);
    static int readCount = 0;
    static int data = 0;

    static class Reader extends Thread {
        private int id;

        Reader(int id) {
            this.id = id;
        }

        public void run() {
            try {
                while (true) {
                    mutex.acquire();
                    readCount++;
                    if (readCount == 1)
                        wrt.acquire();
                    mutex.release();

                    System.out.println("Reader " + id + " is reading data = " + data);
                    Thread.sleep(1000);

                    mutex.acquire();
                    readCount--;
                    if (readCount == 0)
                        wrt.release();
                    mutex.release();

                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Writer extends Thread {
        private int id;

        Writer(int id) {
            this.id = id;
        }

        public void run() {
            try {
                while (true) {
                    wrt.acquire();
                    data++;
                    System.out.println("Writer " + id + " is writing data = " + data);
                    Thread.sleep(1500);
                    wrt.release();

                    Thread.sleep(1500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int numReaders = 5;
        int numWriters = 2;

        for (int i = 1; i <= numReaders; i++)
            new Reader(i).start();

        for (int i = 1; i <= numWriters; i++)
            new Writer(i).start();
    }
}
