package multi_thread.Chapter4.useConditionWaitNotifyOk;

public class Run
{
    public static void main(String[] args) throws InterruptedException
    {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(3000);
        service.signal();
    }
}
