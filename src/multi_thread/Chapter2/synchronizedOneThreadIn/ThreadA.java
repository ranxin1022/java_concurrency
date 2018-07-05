package multi_thread.Chapter2.synchronizedOneThreadIn;

public class ThreadA extends Thread
{
    private ObjectService service;

    public ThreadA(ObjectService service)
    {
        this.service = service;
    }

    @Override
    public void run()
    {
        super.run();
        service.serviceMethod();
    }
}
