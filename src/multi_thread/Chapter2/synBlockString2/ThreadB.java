package multi_thread.Chapter2.synBlockString2;

public class ThreadB extends Thread
{
    private Service service;

    public ThreadB(Service service)
    {
        this.service = service;
    }

    @Override
    public void run()
    {
        service.b();
    }
}
