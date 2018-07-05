package multi_thread.Chapter3.wait_notify_size5;

public class Run
{
    public static void main(String[] args)
    {
        try
        {
            MyList list = new MyList();
            Object lock = new Object();
            ThreadA threadA = new ThreadA(list, lock);
            ThreadB threadB = new ThreadB(list, lock);


            threadB.start();
            Thread.sleep(1000);
            threadA.start();

        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
