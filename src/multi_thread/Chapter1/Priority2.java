package multi_thread.Chapter1;

public class Priority2 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("priority2 run priority=" + this.getPriority());
    }
}
