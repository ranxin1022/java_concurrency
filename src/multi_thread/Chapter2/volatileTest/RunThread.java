package multi_thread.Chapter2.volatileTest;

public class RunThread extends Thread
{
    volatile private boolean isRunning = true;

    public boolean isRunning()
    {
        return isRunning;
    }

    public void setRunning(boolean isRunning)
    {
        this.isRunning = isRunning;
    }

    @Override
    public void run()
    {
        System.out.println("进入run 了");
        while (isRunning == true)
        {

        }

        System.out.println("线程被停止了！");
    }
}
