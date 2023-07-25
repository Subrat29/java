class A extends Thread
{
    public void run()
    {
        // try
        // {
            for(int i=1; i<=5; i++)
            {
                System.out.println("Muh me le");
            }
        // }
        // catch(InterruptedException e)
        // {
            // System.out.println(e);
        // }
    }
}

class B
{
    public static void main(String[] args) throws InterruptedException {
        A t = new A();
        t.start();
        for(int i=1; i<=5; i++)
        {
            System.out.println("mera\n~subrat");
            Thread.sleep(1000);
        }
    }
}