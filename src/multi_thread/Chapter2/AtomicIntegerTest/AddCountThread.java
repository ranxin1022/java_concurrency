package multi_thread.Chapter2.AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread
{
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run()
    {
        for(int i = 0; i<100; i++)
        {
            System.out.println("currentTreadName = " + Thread.currentThread().getName() + ", " + count.incrementAndGet());
        }
    }
}
