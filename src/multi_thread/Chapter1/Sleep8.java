package multi_thread.Chapter1;

public class Sleep8 extends Thread {
    public void run()
    {
        super.run();

        try{
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
