package multi_thread.Chapter7.stateTest2;

public class Run
{
    public static void main(String[] args)
    {
        try
        {
            MyThread thread = new MyThread();
            System.out.println("currentThread = " + Thread.currentThread().getName() + " 在 main方法中的状态1 ： " + thread.getState());
            Thread.sleep(100);
            thread.start();
            Thread.sleep(100);
            System.out.println("currentThread = " + Thread.currentThread().getName() + " main方法中的状态2 ： " + thread.getState());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
