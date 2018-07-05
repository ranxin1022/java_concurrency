package multi_thread.Chapter2.synchronizedMethodLockObject;

public class Run
{
    public static void main(String[] args)
    {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("a");
        ThreadB b = new ThreadB(object);
        b.setName("b");
        a.start();
        b.start();
    }
}
