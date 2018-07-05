package multi_thread.Chapter4.useConditionWaitNotifyOk;

public class ThreadA extends Thread
{
    private MyService service;

    public ThreadA(MyService service)
    {
        this.service = service;
    }

    @Override
    public void run()
    {
        service.await();
    }
}
