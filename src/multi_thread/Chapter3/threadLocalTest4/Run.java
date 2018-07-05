package multi_thread.Chapter3.threadLocalTest4;

public class Run
{
    public static void main(String[] args)
    {
        ThreadLocalExt t1 = new ThreadLocalExt();
        if(t1.get() == null)
        {
            System.out.println(" 从未放过值");
            t1.set("我的值");
        }

        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
