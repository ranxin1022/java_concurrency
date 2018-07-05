package multi_thread.Chapter2.manySynMethodsInClass;

public class Service
{
    synchronized public void service1()
    {
        System.out.println("currentThread " + Thread.currentThread().getName()  + " begin in service1");
        service2();
        System.out.println("currentThread " + Thread.currentThread().getName()  + " end in service1");
    }

    synchronized public void service2()
    {
        System.out.println("currentThread " + Thread.currentThread().getName()  + " begin in service2");
        service3();
        System.out.println("currentThread " + Thread.currentThread().getName()  + " end in service2");
    }

    synchronized public void service3()
    {
        System.out.println("currentThread " + Thread.currentThread().getName()  + " begin in service3");
        System.out.println("currentThread " + Thread.currentThread().getName()  + " end in service3");
    }
}
