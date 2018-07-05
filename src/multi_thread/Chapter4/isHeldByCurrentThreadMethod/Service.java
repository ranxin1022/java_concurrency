package multi_thread.Chapter4.isHeldByCurrentThreadMethod;

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
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        }
        finally
        {
            lock.unlock();
        }
    }
}
