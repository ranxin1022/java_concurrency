package multi_thread.Chapter7.stateTest3;

public class MyService
{
    synchronized static public void serviceMethod()
    {
        try
        {
            System.out.println(Thread.currentThread().getName() + " 进入了业务方法！");
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
