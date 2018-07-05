package multi_thread.Chapter1;

public class StopTest1 {

    public static void main(String[] args)
    {
        try{
            Stop1 stop = new Stop1();
            stop.start();
            Thread.sleep(2000);
            stop.interrupt();
        }
        catch (InterruptedException e)
        {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
