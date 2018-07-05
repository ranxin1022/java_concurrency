package multi_thread.Chapter2.synLockIn_2;

public class Main
{
    public int  i = 10;

    synchronized public void operateIMainMethod()
    {
        try
        {
            i--;
            System.out.println("main print i = " + i);
            Thread.sleep(1);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}