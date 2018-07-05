package multi_thread.Chapter3.wait_notify_size5;

public class ThreadB extends Thread
{

    private MyList list;
    private Object lock;
    public ThreadB(MyList list, Object lock)
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

                while (true)
                {
                    System.out.println(" 在 while 循环里");

                    if (list.size() != 5)
                    {
                        lock.wait();
                    }

                    System.out.println("线程B要退出！");
                    throw new InterruptedException();
                }


                /*
                if(list.size() != 5)
                {
                    System.out.println("wait begin time " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end time " + System.currentTimeMillis());
                }
                */
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
