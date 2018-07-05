package multi_thread.Chapter3.threadLocalTest4;

public class ThreadLocalExt extends ThreadLocal
{
    @Override
    protected Object initialValue()
    {
        return "我是默认值 第一次get不为null";
    }
}
