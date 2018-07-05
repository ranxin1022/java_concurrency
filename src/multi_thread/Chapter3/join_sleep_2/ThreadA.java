package multi_thread.Chapter3.join_sleep_2;

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
                b.join();
                for (int i = 0; i<2; i++)
                {
                    String newString = new String();
                    Math.random();
                }
                System.out.println(" in A run");

            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
