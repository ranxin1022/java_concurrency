package multi_thread.Chapter3.join_sleep_1;

public class ThreadA extends Thread
{
    private ThreadB b;

    public ThreadA(ThreadB b)
    {
        this.b = b;
    }

    @Override
    public void run()
    {
        try
        {
            synchronized (b)
            {
                b.start();
                Thread.sleep(6000);
                System.out.println(" in A run");
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
