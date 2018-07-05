package multi_thread.Chapter3.test2;

public class MyThread2 extends Thread
{
    private Object lock;

    public MyThread2(Object lock)
    {
        this.lock = lock;
    }

    @Override
    public void run()
    {
        synchronized (lock)
        {
            try
            {
                System.out.println("CurrentThread = " + Thread.currentThread().getName() + ", 开始 wait time = " + System.currentTimeMillis());
                lock.notify();
                Thread.sleep(3000);
                System.out.println("CurrentThread = " + Thread.currentThread().getName() + ", 结束 wait time = " + System.currentTimeMillis());

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }

    }
}
