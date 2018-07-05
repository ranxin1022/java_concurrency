package multi_thread.Chapter2.synchronizedOneThreadIn;

public class ObjectService
{
    public void serviceMethod()
    {
        try
        {
            synchronized (this)
            {
                System.out.println("currentThread " + Thread.currentThread().getName() + " begin time = " + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("currentThread " + Thread.currentThread().getName() + " end time = " + System.currentTimeMillis());
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
