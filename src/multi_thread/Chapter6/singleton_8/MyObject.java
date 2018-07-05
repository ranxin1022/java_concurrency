package multi_thread.Chapter6.singleton_8;

public class MyObject
{

    // 立即加载方式= 饿汉模式
    private static MyObject myObject;
    private MyObject()
    {

    }

    static
    {
        myObject = new MyObject();
    }

    public static MyObject getInstance()
    {
        return myObject;
    }
}
