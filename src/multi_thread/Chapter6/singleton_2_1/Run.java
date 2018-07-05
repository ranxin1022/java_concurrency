package multi_thread.Chapter6.singleton_2_1;

public class Run
{
    public static void main(String[] args) throws InterruptedException
    {
        ThreadA a = new ThreadA();
        ThreadA b = new ThreadA();
        ThreadA c = new ThreadA();
        a.start();
        Thread.sleep(100);
        b.start();
        Thread.sleep(100);
        c.start();
    }
}
