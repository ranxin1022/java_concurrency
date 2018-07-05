package multi_thread.Chapter1;

public class Suspend3 extends Thread
{
    private long i = 0;
    @Override
    public void run()
    {
        while (true)
        {
            i++;
        }
    }

    public long getI()
    {
        return this.i;
    }
}
