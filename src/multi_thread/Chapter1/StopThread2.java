package multi_thread.Chapter1;

public class StopThread2 extends Thread
{
    private Stop4 stop2;

    public StopThread2(Stop4 stop2)
    {
        super();
        this.stop2 = stop2;
    }

    public void run()
    {
        stop2.printString("b", "bb");
    }
}
