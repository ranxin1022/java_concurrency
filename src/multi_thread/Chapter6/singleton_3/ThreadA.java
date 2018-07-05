package multi_thread.Chapter6.singleton_3;

public class ThreadA extends Thread
{
    @Override
    public void run()
    {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
