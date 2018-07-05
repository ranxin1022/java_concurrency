package multi_thread.Chapter1;

public class SleepTest9 {
    public static void main(String[] args)
    {
       // try
       // {
            Sleep9 sleep9 = new Sleep9();
            sleep9.start();
            sleep9.interrupt();
        //}
        //catch(InterruptedException e)
        //{
        //    e.printStackTrace();
        //}

        System.out.println("main end!");

    }
}
