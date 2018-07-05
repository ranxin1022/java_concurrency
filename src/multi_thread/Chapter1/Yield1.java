package multi_thread.Chapter1;

public class Yield1 extends Thread
{
    @Override
    public void run()
    {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for(int i = 0; i < 500000; i++)
        {
            Thread.yield();
            count = count + (i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("count=" + count + ",用时："+ (endTime - beginTime) + "毫秒！");
    }
}
