package multi_thread.Chapter3.notifyOne;

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
            // 一次只能随机唤醒一个线程
            lock.notify();
            //lock.notify();
            //lock.notify();
        }
    }
}
