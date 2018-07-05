package multi_thread.Chapter4.conditionTest;

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
        for(int i = 0; i<10; i++)
        {
            service.get();
        }
    }
}
