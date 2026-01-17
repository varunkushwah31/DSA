package Thread;

public class Thread1 {
    static class CSD extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        CSD qwerty = new CSD();
        qwerty.run();
    }
}
