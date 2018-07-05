package multi_thread.Chapter4.MustUseMoreCondition_Error;

public class Run
{
    public static void main(String[] args) throws InterruptedException
    {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();

        Thread.sleep(5000);
        service.signalAll();
    }
}
