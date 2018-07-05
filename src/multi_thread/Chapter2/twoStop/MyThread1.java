package multi_thread.Chapter2.twoStop;

public class MyThread1 extends Thread
{
    private Service service;

    public MyThread1(Service service)
    {
        this.service = service;
    }

    @Override
    public void run()
    {
        super.run();
        service.methodA();
    }
}
