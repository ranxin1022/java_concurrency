package multi_thread.Chapter4.conditionTestManyToMany_all.conditionTestManyToMany;

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
        for(int i = 0; i<10; i++)
        {
            service.set();
        }
    }
}
