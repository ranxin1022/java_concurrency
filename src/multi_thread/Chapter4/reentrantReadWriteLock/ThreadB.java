package multi_thread.Chapter4.reentrantReadWriteLock;

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
        service.read();
    }
}
