package multi_thread.Chapter1;

public class SleepTest8 {
    public static void main(String[] args)
    {
        try
        {
            Sleep8 sleep8 = new Sleep8();
            sleep8.start();
            Thread.sleep(2000);
            sleep8.interrupt();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("main end!");

    }
}
