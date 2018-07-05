package multi_thread.Chapter1;

public class SuspendTest2
{
    public static void main(String[] args)
    {
        try
        {
            final Suspend2 suspend2 = new Suspend2();
            Thread thread1 = new Thread(){
                @Override
                public void run()
                {
                    suspend2.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread(){
                @Override
                public void run()
                {
                    System.out.println("thread2 启动， 但进入不了printString() 方法！");
                    System.out.println("因为printString() 方法被a线程锁定并suspend暂停了！");
                    suspend2.printString();
                }
            };
            thread2.start();
        }
        catch (InterruptedException e)
        {

        }
    }
}
