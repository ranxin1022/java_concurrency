package multi_thread.Chapter1;

public class Sleep9 extends Thread {
    public void run()
    {
        super.run();

        try{
            for(int i= 0; i< 500000; i++)
            {
                System.out.println("i=" + (i+1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end ");
        }
        catch (InterruptedException e)
        {
            System.out.println("sleep catch in run method!");
            e.printStackTrace();
        }

    }
}
