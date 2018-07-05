package multi_thread.Chapter3.test1;

public class Test2
{
    public static void main(String[] args)
    {
        try
        {
            String lock = new String();
            System.out.println("sync 上面");
            synchronized (lock)
            {
                System.out.println("sync 第一行");
                lock.wait();
                System.out.println("wait下的代码");
            }
            System.out.println("sync 下面");
        }
        catch (InterruptedException e)
        {

        }
    }
}
