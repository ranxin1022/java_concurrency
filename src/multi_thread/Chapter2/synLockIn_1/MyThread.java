package multi_thread.Chapter2.synLockIn_1;

public class MyThread extends Thread
{
    @Override
    public void run()
    {
        Service service = new Service();
        service.service1();
    }
}
