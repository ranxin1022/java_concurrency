package multi_thread.Chapter1;

public class SleepTest6 {

    public static void main(String[] args)
    {
        try
        {
            Sleep6 sleep6 = new Sleep6();
            sleep6.start();
            Thread.sleep(1000);
            sleep6.interrupt();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
            System.out.println("main catch!");
        }

        System.out.println("end!");

    }
}
