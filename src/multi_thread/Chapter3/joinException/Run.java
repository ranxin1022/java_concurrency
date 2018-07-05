package multi_thread.Chapter3.joinException;

public class Run
{
    public static void main(String[] args)
    {
        try
        {
            ThreadB threadB = new ThreadB();
            ThreadC threadC = new ThreadC(threadB);
            threadB.start();
            Thread.sleep(500);
            threadC.start();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
