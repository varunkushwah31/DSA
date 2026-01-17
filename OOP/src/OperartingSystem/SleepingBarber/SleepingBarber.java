package OperartingSystem.SleepingBarber;
import java.util.concurrent.Semaphore;
class SleepingBarber {
    static final int CHAIRS = 3;
    static Semaphore customers = new Semaphore(0);
    static Semaphore barber = new Semaphore(0);
    static Semaphore accessSeats = new Semaphore(1);
    static int numberOfFreeSeats = CHAIRS;

    static class Barber extends Thread {
        public void run() {
            while (true) {
                try {
                    customers.acquire();
                    accessSeats.acquire();
                    numberOfFreeSeats++;
                    barber.release();
                    accessSeats.release();

                    System.out.println("Barber is cutting hair...");
                    Thread.sleep(2000);
                    System.out.println("Barber finished haircut.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Customer extends Thread {
        int id;

        Customer(int id) {
            this.id = id;
        }

        public void run() {
            try {
                accessSeats.acquire();
                if (numberOfFreeSeats > 0) {
                    numberOfFreeSeats--;
                    System.out.println("Customer " + id + " is waiting. Free seats = " + numberOfFreeSeats);
                    customers.release();
                    accessSeats.release();

                    barber.acquire();
                    System.out.println("Customer " + id + " is getting a haircut.");
                    Thread.sleep(1000);
                    System.out.println("Customer " + id + " is leaving the shop.");
                } else {
                    System.out.println("Customer " + id + " left (no free chairs).");
                    accessSeats.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Barber().start();

        for (int i = 1; i <= 10; i++) {
            new Customer(i).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
