class Printer {
    void toDisplay(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Printer target;
    Thread t;

    public Caller(Printer targ, String s) {
        msg = s;
        target = targ;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (target) {
            target.toDisplay(msg);
        }
    }
}

class Thr7 {
    public static void main(String args[]) {
        Printer target = new Printer();
        Caller o1 = new Caller(target, "Hello");
        Caller o2 = new Caller(target, "synchronized");
        Caller o3 = new Caller(target, "world");
        try {
            o1.t.join();
            o2.t.join();
            o3.t.join();
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }
}
