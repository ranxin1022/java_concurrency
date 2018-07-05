package multi_thread.Chapter7.groupAddThreadMoreLevel;

public class Run
{
    public static void main(String[] args)
    {
        ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup);

        System.out.println("main 中有多少个子线程组:" + listGroup.length + " 名字为：" + listGroup[0].getName());
    }
}
