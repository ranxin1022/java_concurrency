package multi_thread.Chapter4.readWriteLockBegin2;

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
        service.write();
    }
}
