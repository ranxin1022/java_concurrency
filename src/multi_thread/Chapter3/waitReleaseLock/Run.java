package multi_thread.Chapter3.waitReleaseLock;

public class Run
{
    public static void main(String[] args)
    {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        ThreadB threadB = new ThreadB(lock);
        threadA.start();
        threadB.start();
    }
}
