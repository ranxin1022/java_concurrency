package multi_thread.Chapter3.waitOld;

public class ThreadSubtract extends Thread
{
    private Subtract s;

    public ThreadSubtract(Subtract s)
    {
        this.s = s;
    }

    @Override
    public void run()
    {
        s.subtract();
    }
}
