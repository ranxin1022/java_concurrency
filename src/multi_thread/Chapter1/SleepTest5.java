package multi_thread.Chapter1;

public class SleepTest5 {

    public static void main(String[] args)
    {
        try
        {
            Sleep55 sleep5 = new Sleep55();
            sleep5.start();
            Thread.sleep(2000);
            sleep5.interrupt();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
