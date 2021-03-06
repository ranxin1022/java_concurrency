package multi_thread.Chapter3.waitInterruptException;

public class Test
{
    public static void main(String[] args)
    {
        try
        {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(500);
            a.interrupt();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
