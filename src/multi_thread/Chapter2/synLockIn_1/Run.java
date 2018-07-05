package multi_thread.Chapter2.synLockIn_1;

public class Run
{
    public static void main(String[] args)
    {
        MyThread thread = new MyThread();
        MyThread thread1 = new MyThread();
        thread.setName("A");
        thread1.setName("B");
        thread.start();
        thread1.start();
    }
}
