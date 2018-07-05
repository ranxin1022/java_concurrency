package multi_thread.Chapter3.firstNotify;

public class MyRun2
{
    private String lock = new String("");
    private boolean isFirstRunB = false;

    private Runnable runnableA = new Runnable()
    {
        @Override
        public void run()
        {
            try
            {
                synchronized (lock)
                {
                    while (isFirstRunB == false)
                    {
                        System.out.println("begin wait");
                        lock.wait();
                        System.out.println("end wait");
                    }
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
                isFirstRunB = true;

            }
        }
    };

    public static void main(String[] args) throws InterruptedException
    {
        MyRun2 run = new MyRun2();
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
