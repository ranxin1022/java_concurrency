package multi_thread.Chapter2.twoStop;

public class Service
{
    public void methodA()
    {
        Object  object1 = new Object();
        synchronized(object1)
        {
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun)
            {

            }
            System.out.println("methodA end");
        }
    }

    public void methodB()
    {
        Object  object1 = new Object();
        synchronized(object1)
        {
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
