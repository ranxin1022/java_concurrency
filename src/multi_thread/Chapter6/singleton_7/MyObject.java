package multi_thread.Chapter6.singleton_7;

public class MyObject
{

    // 延迟加载方式 = 懒汉模式
    private static class MyObjectHandler
    {
        private static MyObject myObject = new MyObject();
    }

    private MyObject()
    {

    }

    public static MyObject getInstance()
    {
        return MyObjectHandler.myObject;
    }
}
