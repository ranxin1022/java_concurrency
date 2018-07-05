package multi_thread.Chapter7.stateTest2;

public class MyThread extends Thread
{
    public MyThread()
    {
        System.out.println("currentThread = " + Thread.currentThread().getName() + " 构造方法中的状态 ： " + Thread.currentThread().getState());
    }

    @Override
    public void run()
    {
        try
        {
            System.out.println("currentThread = " + Thread.currentThread().getName() + " run 方法中的状态： " + Thread.currentThread().getState());
            Thread.sleep(5000);
            System.out.println("currentThread = " + Thread.currentThread().getName() + " run 方法中的状态： " + Thread.currentThread().getState());

        }
        catch (InterruptedException e)
        {
            e.printStackTrace();

        }
    }
}
