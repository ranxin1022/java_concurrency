package multi_thread.Chapter4.useConditionWaitNotifyOk;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService
{
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await()
    {
        try
        {
            lock.lock();
            System.out.println(" await 起始时间为 " + System.currentTimeMillis());
            condition.await();
            System.out.println(" await 终止时间为 " + System.currentTimeMillis());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            lock.unlock();
        }
    }

    public void signal()
    {
        try
        {
            lock.lock();
            System.out.println(" signal 时间为 " + System.currentTimeMillis());
            condition.signal();
        }
        finally
        {
            lock.unlock();
        }

    }
}
