package multi_thread.Chapter1;

public class Priority1 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("priority1 run priority=" + this.getPriority());
        Priority2 priority2 = new Priority2();
        priority2.start();
    }
}
