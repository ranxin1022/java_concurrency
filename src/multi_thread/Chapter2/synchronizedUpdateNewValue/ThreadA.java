package multi_thread.Chapter2.synchronizedUpdateNewValue;

public class ThreadA extends Thread
{
    private Service service;

    public ThreadA(Service service)
    {
        this.service = service;
    }

    @Override
    public void run()
    {
        service.runMethod();
    }
}
