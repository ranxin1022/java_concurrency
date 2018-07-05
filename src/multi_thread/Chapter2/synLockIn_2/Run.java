package multi_thread.Chapter2.synLockIn_2;

public class Run
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        t.start();
    }
}
