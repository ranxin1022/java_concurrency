package multi_thread.Chapter4.MustUseMoreCondition_ok;

public class ThreadB extends Thread
{
    private MyService service;

    public ThreadB(MyService service)
    {
        this.service = service;
    }

    @Override
    public void run()
    {
        service.awaitB();
    }
}
