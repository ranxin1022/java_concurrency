package multi_thread.Chapter3.TwoThreadTransData;

public class ThreadB extends Thread
{

    private MyList list;
    public ThreadB(MyList list)
    {
        this.list = list;
    }

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                System.out.println(" 在 while 循环里");
                if(list.size() == 5)
                {
                    System.out.println("==5，线程B要退出！");
                    throw new InterruptedException();
                }
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
