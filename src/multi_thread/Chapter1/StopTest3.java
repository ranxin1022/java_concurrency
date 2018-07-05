package multi_thread.Chapter1;

public class StopTest3
{
    public static void main(String[] args)
    {
        try
        {
           Stop3 stop1 = new Stop3();
           stop1.start();
           Thread.sleep(8000);
           stop1.stop();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
