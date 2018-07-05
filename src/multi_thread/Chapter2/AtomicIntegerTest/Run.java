package multi_thread.Chapter2.AtomicIntegerTest;

public class Run
{
    public static void main(String[] args)
    {
        AddCountThread thread = new AddCountThread();
        Thread t1 = new Thread(thread, "A");
        Thread t2 = new Thread(thread, "B");
        Thread t3 = new Thread(thread, "C");
        Thread t4 = new Thread(thread, "D");
        Thread t5 = new Thread(thread, "E");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
