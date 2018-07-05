package multi_thread.Chapter3.joinTest2;

public class Test
{
    public static void main(String[] args)
    {
        try
        {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();
            System.out.println("我想当threadTest执行完后再执行， 我做到了");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
