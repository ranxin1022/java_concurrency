package multi_thread.Chapter7.threadExceptionMore;

public class Run3
{
    public static void main(String[] args)
    {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread myThread = new MyThread(group, "我的线程");
        //myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());

        myThread.start();
    }
}
