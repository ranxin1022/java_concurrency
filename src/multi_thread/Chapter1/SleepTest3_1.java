package multi_thread.Chapter1;

public class SleepTest3_1 {
    public static void main(String[] args)
    {
        Thread.currentThread().interrupt();
        System.out.println("is interrupt " + Thread.interrupted());
        System.out.println("is interrupt " + Thread.interrupted());
        System.out.println("end");
    }
}
