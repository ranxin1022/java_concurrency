package multi_thread.Chapter7.stateTest4;

public class Run
{
    public static void main(String[] args)
    {
        try
        {
            MyThread t = new MyThread();
            MyThreadB b = new MyThreadB();
            t.start();
            Thread.sleep(1000);
            System.out.println(" main 方法中t的状态：" + t.getState());
            b.start();
            Thread.sleep(1000);
            System.out.println(" main 方法中t的状态：" + t.getState());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
