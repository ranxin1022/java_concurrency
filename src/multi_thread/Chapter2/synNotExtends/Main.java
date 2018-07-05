package multi_thread.Chapter2.synNotExtends;

public class Main
{
    synchronized public void serviceMethod()
    {
        try
        {
            System.out.println("first step in main threadName = " + Thread.currentThread().getName() + "time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("next step in main threadName = " + Thread.currentThread().getName() + "time = " + System.currentTimeMillis());

        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
