package multi_thread.Chapter1.t22;

public class Run
{
    public static void main(String[] args)
    {
        try
        {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
