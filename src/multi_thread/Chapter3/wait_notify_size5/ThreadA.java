package multi_thread.Chapter3.wait_notify_size5;

public class ThreadA extends Thread
{
    private MyList list;
    private Object lock;

    public ThreadA(MyList list, Object lock)
    {
        this.list = list;
        this.lock = lock;
    }

    @Override
    public void run()
    {
        synchronized (lock)
        {
            try
            {
                for (int i = 0; i < 10; i++)
                {
                    if(list.size() == 5)
                    {
                        lock.notify();
                        System.out.println("已发出通知！");
                    }
                    list.add();
                    System.out.println("添加了" + (i + 1) + " 个元素！");
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
