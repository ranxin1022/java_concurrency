package multi_thread.Chapter3.joinMoreTest;

public class Run1
{
    public static void main(String[] args)
    {
        try
        {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);

            a.start();
            b.start();
           // b.join(2000);
            b.join();
            System.out.println(" main end " + System.currentTimeMillis());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
