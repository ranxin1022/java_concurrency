package multi_thread.Chapter2.synchronizedUpdateNewValue;

public class Run
{

    public static void main(String[] args)
    {
        try
        {
            Service service = new Service();
            ThreadA threadA = new ThreadA(service);
            ThreadB threadB = new ThreadB(service);

            threadA.start();
            Thread.sleep(1000);
            threadB.start();

            System.out.println("已经发起停止的命令了！");
        }
        catch (InterruptedException e)
        {

        }
    }
}
