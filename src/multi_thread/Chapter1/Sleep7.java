package multi_thread.Chapter1;

public class Sleep7 extends Thread {
    public void run()
    {
        super.run();

        try{
            for(int i = 0; i < 500000; i++)
            {
                if(this.isInterrupted())
                {
                    System.out.println("sleep6 i am interrupted!");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("i am under for ");
        }
        catch (InterruptedException e)
        {
            System.out.println("catch in run method!");
            e.printStackTrace();
        }

    }
}
