package multi_thread.Chapter2.synLockIn_1;

public class Service
{

    synchronized public void service1()
    {
        System.out.println("currentThread: " + Thread.currentThread().getName() + " service1");
        service2();
    }

    synchronized public void service2()
    {
        System.out.println("currentThread: " + Thread.currentThread().getName() + "service2");
        service3();
    }

    synchronized public void service3()
    {
        System.out.println("currentThread: " + Thread.currentThread().getName() + "service3");
    }
}
