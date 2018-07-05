package multi_thread.Chapter7.stateTest4;

public class MyThreadB extends Thread
{
    @Override
    public void run()
    {

        synchronized (Lock.lock)
        {
            Lock.lock.notify();
        }

    }
}
