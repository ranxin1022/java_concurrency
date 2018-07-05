package multi_thread.Chapter1;

public class StopTest2
{
    public static void main(String[] args)
    {
        try
        {
            Stop4 stop2 = new Stop4();
            StopThread2 stopThread2 = new StopThread2(stop2);
            stopThread2.start();
            Thread.sleep(500);
            stopThread2.stop();
            System.out.println(stop2.getUsername() + " " + stop2.getPassword());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
