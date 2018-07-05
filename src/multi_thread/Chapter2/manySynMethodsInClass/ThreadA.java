package multi_thread.Chapter2.manySynMethodsInClass;

public class ThreadA extends Thread
{
    private Service s;

    public ThreadA(Service s)
    {
        this.s = s;
    }

    @Override
    public void run()
    {
        super.run();
        s.service1();
    }
}
