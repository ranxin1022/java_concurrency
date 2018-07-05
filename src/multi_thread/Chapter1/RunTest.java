package multi_thread.Chapter1;

public class RunTest {
    public static void main(String[] args)
    {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("run finished!");
    }
}
