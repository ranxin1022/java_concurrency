package multi_thread.Chapter4.conditionTestMoreMethod;

public class ThreadBB extends Thread
{
    private MyService service;

    public ThreadBB(MyService service)
    {
        this.service = service;
    }

    @Override
    public void run()
    {
        service.methodB();
    }
}
