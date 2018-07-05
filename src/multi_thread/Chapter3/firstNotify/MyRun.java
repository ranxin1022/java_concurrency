package multi_thread.Chapter3.firstNotify;

public class MyRun
{
    private String lock = new String("");
    private Runnable runnableA = new Runnable()
    {
        @Override
        public void run()
        {
            try
            {
                synchronized (lock)
                {
                    System.out.println("begin wait");
                    lock.wait();
                    System.out.println("end wait");
                }
            }
            catch (InterruptedException e)
            {

            }
        }
    };

    private Runnable runnableB = new Runnable()
    {
        @Override
        public void run()
        {
            synchronized (lock)
            {
                System.out.println("begin notify");
                lock.notify();
                System.out.println("begin notify");

            }
        }
    };

    public static void main(String[] args) throws InterruptedException
    {
        MyRun run = new MyRun();
        Thread a = new Thread(run.runnableA);
        Thread b= new Thread(run.runnableB);

        b.start();
        Thread.sleep(100);
        a.start();
        /*
        a.start();
        b.start();
        */
    }
}
