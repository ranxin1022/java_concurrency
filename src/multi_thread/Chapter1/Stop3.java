package multi_thread.Chapter1;

public class Stop3 extends Thread {
    private int i = 0;

    public void run()
    {
        try
        {
            while (true)
            {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
