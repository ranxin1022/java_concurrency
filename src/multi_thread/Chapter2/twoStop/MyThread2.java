package multi_thread.Chapter2.twoStop;


public class MyThread2 extends Thread
{
    private Service service;

    public MyThread2(Service service)
    {
        this.service = service;
    }

    @Override
    public void run()
    {
        service.methodB();
    }
}
