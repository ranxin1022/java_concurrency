package multi_thread.Chapter1;


public class SleepTest3 {

    public static void main(String[] args)
    {
        try{
            Sleep3 sleep3 = new Sleep3();
            sleep3.start();
            Thread.sleep(1000);
            sleep3.interrupt();
            System.out.println("is stop or not1? = " + sleep3.interrupted());
            System.out.println("is stop or not2? = " + sleep3.interrupted());
            System.out.println("is stop or not3? = " + sleep3.isInterrupted());
            System.out.println("is stop or not4? = " + sleep3.isInterrupted());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
