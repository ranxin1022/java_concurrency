package multi_thread.Chapter2.synchronizedMethodLockObject2;

public class MyObject
{
    synchronized public void methodA()
    {
        try
        {
            System.out.println("begin methodA treadName = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime = " + System.currentTimeMillis());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    synchronized public void methodB()
    {
        try
        {
            System.out.println("begin methodB treadName = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
