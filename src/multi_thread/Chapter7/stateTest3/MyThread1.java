package multi_thread.Chapter7.stateTest3;

public class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        MyService.serviceMethod();
    }
}
