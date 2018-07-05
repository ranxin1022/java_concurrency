package multi_thread.Chapter1;

public class SuspendTest4
{
    public static void main(String[] args) throws InterruptedException
    {
        final Suspend4 suspend4 = new Suspend4();
        Thread thread1 = new Thread(){
            @Override
            public void run()
            {
                suspend4.setValue("a", "aa");
            }
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(3000);

        Thread thread2 = new Thread(){
            @Override
            public void run()
            {
                suspend4.printUsernamePassword();
            }
        };
        thread2.start();

        //停止a 线程
        //a,
    }
}
