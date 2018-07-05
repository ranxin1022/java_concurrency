package multi_thread.Chapter3.inheritableThreadLocal1;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal
{
    @Override
    protected Object initialValue()
    {
        return new Date().getTime();
    }
}
