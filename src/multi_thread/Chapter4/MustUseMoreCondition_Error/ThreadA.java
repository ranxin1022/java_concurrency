package multi_thread.Chapter4.MustUseMoreCondition_Error;

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
        service.awaitA();
    }
}
