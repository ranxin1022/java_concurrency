package multi_thread.Chapter1;


public class SleepTest3_2 {

    public static void main(String[] args)
    {
        try{
            Sleep4 sleep4 = new Sleep4();
            sleep4.start();
            Thread.sleep(1000);
            sleep4.interrupt();
            System.out.println("is stop or not3? = " + sleep4.isInterrupted());
            System.out.println("is stop or not4? = " + sleep4.isInterrupted());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
