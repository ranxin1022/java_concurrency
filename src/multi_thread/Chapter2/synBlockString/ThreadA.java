package multi_thread.Chapter2.synBlockString;

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
        service.setUsernamePassword("A", "AA");
    }
}
