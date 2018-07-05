package multi_thread.Chapter4.queueThreadMethod;

public class Run
{
    public static void main(String[] args) throws InterruptedException
    {
        final Service service = new Service();
        Runnable runnable = new Runnable()
        {
            @Override
            public void run()
            {
                service.waitMethod();
            }
        };

        Thread threadA = new Thread(runnable);
        Thread threadB = new Thread(runnable);

        threadA.start();
        Thread.sleep(500);

        threadB.start();
        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());


    }
}
