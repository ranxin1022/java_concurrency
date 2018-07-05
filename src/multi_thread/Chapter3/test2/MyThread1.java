package multi_thread.Chapter3.test2;

public class MyThread1 extends Thread
{
    private Object lock;

    public MyThread1(Object lock)
    {
        this.lock = lock;
    }

    @Override
    public void run()
    {
        try
        {
            synchronized (lock)
            {
                System.out.println("CurrentThread = " + Thread.currentThread().getName() + ", 开始 wait time = " + System.currentTimeMillis());
                lock.wait();
                System.out.println("CurrentThread = " + Thread.currentThread().getName() + ", 结束 wait time = " + System.currentTimeMillis());
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
