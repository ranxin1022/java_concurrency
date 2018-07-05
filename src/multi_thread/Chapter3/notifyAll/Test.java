package multi_thread.Chapter3.notifyAll;

public class Test
{
    public static void main(String[] args) throws InterruptedException
    {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        ThreadB b = new ThreadB(lock);
        ThreadC c = new ThreadC(lock);

        a.start();
        b.start();
        c.start();

        Thread.sleep(1000);
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
    }
}
