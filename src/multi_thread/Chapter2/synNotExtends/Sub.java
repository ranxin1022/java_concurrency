package multi_thread.Chapter2.synNotExtends;

public class Sub extends Main
{
    @Override
    synchronized public void serviceMethod()
    {
        try
        {
            System.out.println("first step in sub threadName = " + Thread.currentThread().getName() + "time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("next step in sub threadName = " + Thread.currentThread().getName() + "time = " + System.currentTimeMillis());

            super.serviceMethod();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
