public class Thr2 implements Runnable {
    Thread t;

    Thr2() {
        t = new Thread(this, "Demo of thread");
        System.out.println("Child Thread : " + t);
        t.start();

        // public synchronized start();
    }

    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Child Thread : " + n);
                Thread.sleep(2000);
            }

        } catch (Exception e) {
            System.out.println("main thread interrupted");
        }
    }

    public static void main(String[] args) {
        new Thr2();

        try {
            for (int n = 1; n <= 5; n++) {
                System.out.println("main Thread : " + n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread exiting");
    }

}
