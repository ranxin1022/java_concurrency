package multi_thread.Chapter1;

public class SuspendTest1
{

    public static void main(String[] args)
    {
        try
        {
            Suspend1 suspend1 = new Suspend1();
            suspend1.start();
            Thread.sleep(5000);

            //A
            //
            suspend1.suspend();
            System.out.println("A = " + System.currentTimeMillis() + " i = " + suspend1.getI());
            Thread.sleep(5000);
            System.out.println("A = " + System.currentTimeMillis() + " i = " + suspend1.getI());

            //B
            //
            suspend1.resume();
            Thread.sleep(5000);

            //C
            //
            //suspend1.suspend();
            System.out.println("B = " + System.currentTimeMillis() + " i = " + suspend1.getI());
            Thread.sleep(5000);
            System.out.println("B = " + System.currentTimeMillis() + " i = " + suspend1.getI());
        }
        catch (InterruptedException e)
        {

        }
    }
}
