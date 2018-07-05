package multi_thread.Chapter4.conditionTestMoreMethod;

public class ThreadAA extends Thread
{
    private MyService service;

    public ThreadAA(MyService service)
    {
        this.service = service;
    }

    @Override
    public void run()
    {
        service.methodA();
    }
}
