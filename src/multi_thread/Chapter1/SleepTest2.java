package multi_thread.Chapter1;

public class SleepTest2 {

    public static void main(String[] args)
    {
        Sleep2  sleep = new Sleep2();
        System.out.println("begin = " + System.currentTimeMillis());
        sleep.start();
        System.out.println("end = " + System.currentTimeMillis());
    }
}
