package multi_thread.Chapter6.singleton_5;

public class ThreadA extends Thread
{
    @Override
    public void run()
    {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
