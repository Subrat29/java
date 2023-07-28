class NewThread extends Thread {

    NewThread() {
        // by runnable interface
        // t = new Thread(this, "Thread through extends Thread");
        // System.out.println("Child Thread : " + t);
        // t.start();

        // by Thread class
        super("New Thread");
        System.out.println("child thread : " + this);
        start();
    }

    public void run() {
    }
}

public class Thr3 {
    public static void main(String[] args) {
        new NewThread();

        Thread t = Thread.currentThread();
        System.out.println("Main Thread : " + t);
    }
}
