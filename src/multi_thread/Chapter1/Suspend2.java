package multi_thread.Chapter1;

public class Suspend2
{
    synchronized public void printString()
    {
        System.out.println("begin");
        if(Thread.currentThread().getName().equals("a"))
        {
            System.out.println("a 线程永远 suspend");
            Thread.currentThread().suspend();
        }

        System.out.println("end");
    }
}
