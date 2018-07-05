package multi_thread.Chapter3.test2;

public class Run
{
    public static void main(String[] args)
    {
        try
        {
            Object lock = new Object();
            MyThread1 thread1 = new MyThread1(lock);
            MyThread2 thread2 = new MyThread2(lock);

            thread1.start();
            Thread.sleep(3000);
            thread2.start();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
