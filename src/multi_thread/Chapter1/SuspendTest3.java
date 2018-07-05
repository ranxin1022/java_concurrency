package multi_thread.Chapter1;

public class SuspendTest3
{
    public static void main(String[] args)
    {
        try
        {
            Suspend3 suspend3 = new Suspend3();
            suspend3.start();
            Thread.sleep(1000);
            suspend3.suspend();
            System.out.println(suspend3.getI());
            System.out.println("main end!");
            System.out.println(suspend3.getI());
        }
        catch (InterruptedException e)
        {

        }
    }
}
