package multi_thread.Chapter3.notifyAll;

public class NotifyThread extends Thread
{
    private  Object lock;

    public NotifyThread(Object lock)
    {
        this.lock = lock;
    }

    @Override
    public void run()
    {
        synchronized (lock)
        {
            // 一次可以唤醒所有线程
            lock.notifyAll();
        }
    }
}
