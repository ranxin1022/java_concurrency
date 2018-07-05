package multi_thread.Chapter4.isFairTest;

import java.util.concurrent.locks.ReentrantLock;

public class Service
{
    private ReentrantLock lock;
    public Service(boolean isFair)
    {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMetod()
    {
        try
        {
            lock.lock();
            System.out.println(" 公平锁 情况： " + lock.isFair());
        }
        finally
        {
            lock.unlock();
        }
    }
}
