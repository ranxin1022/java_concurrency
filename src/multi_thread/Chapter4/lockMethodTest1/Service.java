package multi_thread.Chapter4.lockMethodTest1;

import java.util.concurrent.locks.ReentrantLock;

public class Service
{
    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1()
    {
        try
        {
            lock.lock();
            System.out.println(" serviceMethod1 getHoldCount=" + lock.getHoldCount());

        }
        finally
        {
            lock.unlock();
            serviceMethod2();
        }
    }

    public void serviceMethod2()
    {
        try
        {
            lock.lock();
            System.out.println(" serviceMethod2 getHoldCount=" + lock.getHoldCount());
        }
        finally
        {
            lock.unlock();
        }
    }
}
