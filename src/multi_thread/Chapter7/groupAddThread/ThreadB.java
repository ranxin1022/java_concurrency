package multi_thread.Chapter7.groupAddThread;

public class ThreadB extends Thread
{
    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                System.out.println(" ThreadName = " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
