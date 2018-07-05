package multi_thread.Chapter2.dirtyRead;

public class Test
{
    public static void main(String[] args)
    {
        try
        {
            PublicVar publicVar = new PublicVar();
            ThreadA threadA = new ThreadA(publicVar);
            threadA.start();
            Thread.sleep(600);
            publicVar.getValue();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
