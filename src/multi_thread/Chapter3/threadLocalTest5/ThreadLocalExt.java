package multi_thread.Chapter3.threadLocalTest5;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal
{
    @Override
    protected Object initialValue()
    {
        return new Date().getTime();
    }
}
