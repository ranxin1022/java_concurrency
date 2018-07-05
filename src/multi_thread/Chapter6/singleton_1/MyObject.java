package multi_thread.Chapter6.singleton_1;

public class MyObject
{

    // 延迟加载方式= 懒汉模式
    private static MyObject myObject;
    private MyObject()
    {

    }

    public static MyObject getInstance()
    {
        if(myObject == null)
        {
            myObject = new MyObject();
        }
        return myObject;
    }
}
