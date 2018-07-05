package multi_thread.Chapter7.mainGroup;

public class Run
{
    public static void main(String[] args)
    {
        System.out.println(" 线程组名称：" + Thread.currentThread().getThreadGroup().getName());
        System.out.println(" 线程组中活动的线程数量：" + Thread.currentThread().getThreadGroup().activeCount());
        Thread[] a = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(a);
        for(int i = 0; i<a.length;i++)
        {
            System.out.println(a[i].getName());
        }
        System.out.println(" 线程组中线程组的数量 - 加之前：" + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup group = new ThreadGroup(Thread.currentThread().getThreadGroup(), "hehe");
        System.out.println(" 线程组中线程组的数量 - 加之后：" + Thread.currentThread().getThreadGroup().activeGroupCount());
        System.out.println(" 父线程组名称：" + Thread.currentThread().getThreadGroup().getParent().getName());

    }
}
