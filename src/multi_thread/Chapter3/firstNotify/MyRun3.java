package multi_thread.Chapter3.firstNotify;

public class MyRun3
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
        MyRun3 run = new MyRun3();
        Thread a = new Thread(run.runnableA);
        Thread b= new Thread(run.runnableB);


        a.start();
        Thread.sleep(100);
        b.start();

    }
}
