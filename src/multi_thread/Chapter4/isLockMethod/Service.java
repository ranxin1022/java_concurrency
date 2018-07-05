package multi_thread.Chapter4.isLockMethod;

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
            System.out.println(lock.isLocked());
            lock.lock();
            System.out.println(lock.isLocked());
        }
        finally
        {
            lock.unlock();
        }
    }
}
