package multi_thread.Chapter4.isFairTest;

public class Run
{
    public static void main(String[] args)
    {
        final Service service1 = new Service(true);

        Runnable runnable = new Runnable()
        {
            @Override
            public void run()
            {
                service1.serviceMetod();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        final Service service2 = new Service(false);

        runnable = new Runnable()
        {
            @Override
            public void run()
            {
                service2.serviceMetod();
            }
        };

        thread = new Thread(runnable);
        thread.start();
    }
}
