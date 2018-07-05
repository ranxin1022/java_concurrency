package multi_thread.Chapter3.join_sleep_1;

public class ThreadC extends Thread
{
    private ThreadB threadB;

    public ThreadC(ThreadB b)
    {
        this.threadB = b;
    }

    @Override
    public void run()
    {
        threadB.bService();
    }
}
