package multi_thread.Chapter2.manySynMethodsInClass;

public class ThreadB extends Thread
{
    private Service s;

    public ThreadB(Service s)
    {
        this.s = s;
    }

    @Override
    public void run()
    {
        s.service1();
    }
}
