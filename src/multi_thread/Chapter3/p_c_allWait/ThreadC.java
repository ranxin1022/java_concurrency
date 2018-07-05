package multi_thread.Chapter3.p_c_allWait;

public class ThreadC extends Thread
{

    private C c;
    public ThreadC(C c)
    {
        this.c = c;
    }

    @Override
    public void run()
    {
        while (true)
        {
            c.getValue();
        }
    }
}
