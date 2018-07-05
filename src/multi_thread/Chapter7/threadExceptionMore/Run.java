package multi_thread.Chapter7.threadExceptionMore;

public class Run
{
    public static void main(String[] args)
    {

        MyThread myThread = new MyThread();
        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());

        myThread.start();
    }
}
