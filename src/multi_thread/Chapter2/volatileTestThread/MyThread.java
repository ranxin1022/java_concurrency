package multi_thread.Chapter2.volatileTestThread;

public class MyThread extends Thread
{
    //volatile public static int count;
    public static int count;

    synchronized private static void addCount()
    //private static void addCount()
    {
        try
        {
            Thread.sleep(1);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        for(int i= 0;i <100; i++)
        {
            count++;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run()
    {
        addCount();
    }
}
