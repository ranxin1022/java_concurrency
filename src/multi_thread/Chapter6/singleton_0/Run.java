package multi_thread.Chapter6.singleton_0;

public class Run
{
    public static void main(String[] args)
    {
        ThreadA a = new ThreadA();
        ThreadA b = new ThreadA();
        ThreadA c = new ThreadA();
        a.start();
        b.start();
        c.start();
    }
}
