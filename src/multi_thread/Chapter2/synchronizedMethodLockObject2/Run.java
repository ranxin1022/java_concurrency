package multi_thread.Chapter2.synchronizedMethodLockObject2;

public class Run
{
    public static void main(String[] args)
    {

        // A 线程先持有object对象的Lock锁， B线程可以以异步的方式调用object对象的非synchronized的方法;
        // A 线程先持有object对象的Lock锁， B线程如果在这时调用object对象中的synchronized类型的方法则需要等待， 也就是同步

        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(object);
        ThreadB threadB = new ThreadB(object);
        threadA.start();
        threadB.start();
    }
}
