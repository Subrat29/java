public class Th1 {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println("Current Thread : " + t);

        t.setName("Chullad Thread");
        System.out.println("New Name of current Thread : " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);

                // The static method sleep(long) from the type Thread should be accessed in a
                // static way
                // t.sleep(10000);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("main thread Interrupted Exception");
        }

    }
}
