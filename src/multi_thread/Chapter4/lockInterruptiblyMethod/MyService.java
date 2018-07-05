package multi_thread.Chapter4.lockInterruptiblyMethod;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService
{
    public ReentrantLock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void waitMethod()
    {
        try
        {
            lock.lock();

        }

        finally
        {
            lock.unlock();
        }
    }
}
