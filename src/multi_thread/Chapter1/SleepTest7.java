package multi_thread.Chapter1;

public class SleepTest7 {

    public static void main(String[] args)
    {
        try
        {
            Sleep7 sleep7 = new Sleep7();
            sleep7.start();
            Thread.sleep(1000);
            sleep7.interrupt();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
            System.out.println("main catch!");
        }

        System.out.println("end!");

    }
}
