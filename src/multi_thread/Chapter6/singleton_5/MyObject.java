package multi_thread.Chapter6.singleton_5;

public class MyObject
{

    // 延迟加载方式= 懒汉模式
    private static MyObject myObject;

    private MyObject()
    {

    }

    public static MyObject getInstance()
    {

        try
        {
            System.out.println(" begin threadName = " + Thread.currentThread().getName());
            if (myObject == null)
            {
                System.out.println(" in if threadName = " + Thread.currentThread().getName());

                Thread.sleep(3000);
                synchronized (MyObject.class)
                {
                    if(myObject == null)
                    {
                        myObject = new MyObject();
                    }

                }
                System.out.println(" hashCode = " + myObject.hashCode());
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        return myObject;
    }
}
