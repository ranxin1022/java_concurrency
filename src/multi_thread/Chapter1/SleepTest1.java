package multi_thread.Chapter1;

public class SleepTest1 {
    public static void main(String[] args)
    {
        Sleep1 sleep = new Sleep1();
        System.out.println("begin = " + System.currentTimeMillis());
        sleep.run();
        System.out.println("end = " + System.currentTimeMillis());
    }
}
