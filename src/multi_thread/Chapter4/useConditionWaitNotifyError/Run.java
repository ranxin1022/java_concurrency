package multi_thread.Chapter4.useConditionWaitNotifyError;

public class Run
{

    public static void main(String[] args)
    {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
