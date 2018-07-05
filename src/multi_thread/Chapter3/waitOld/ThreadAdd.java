package multi_thread.Chapter3.waitOld;

public class ThreadAdd extends Thread
{
    private Add a;

    public ThreadAdd(Add a)
    {
        this.a = a;
    }

    @Override
    public void run()
    {
        a.add();
    }
}
