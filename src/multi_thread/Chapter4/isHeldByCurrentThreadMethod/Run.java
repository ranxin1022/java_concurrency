package multi_thread.Chapter4.isHeldByCurrentThreadMethod;

public class Run
{
    public static void main(String[] args)
    {
        final  Service service1 = new Service(true);

        Runnable runnable = new Runnable()
        {
            @Override
            public void run()
            {
                service1.serviceMetod();
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
