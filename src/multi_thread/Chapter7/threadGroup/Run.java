package multi_thread.Chapter7.threadGroup;

public class Run
{
    public static void main(String[] args)
    {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread[] threads = new MyThread[10];
        /*
        for(int i= 0 ;i < 10;i ++)
        {
            threads[i] = new MyThread(group, "线程" + (i+1), "1");
            threads[i].start();
        }
        */
        threads[1] = new MyThread(group, "线程1" , "1");
        threads[1].start();
        MyThread newT = new MyThread(group, " 报错线程", "a");
        newT.start();
    }
}
