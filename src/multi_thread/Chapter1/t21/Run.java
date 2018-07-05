package multi_thread.Chapter1.t21;

public class Run
{
    public static void main(String[] args)
    {
        try
        {
            ThreadA a = new ThreadA();
            a.setPriority(1);
            a.start();
            ThreadB b= new ThreadB();
            b.setPriority(10);
            b.start();
            Thread.sleep(20000);
            a.stop();
            b.stop();
            System.out.println("a=" + a.getCount());
            System.out.println("b=" + b.getCount());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
