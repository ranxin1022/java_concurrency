package multi_thread.Chapter2.twoStop;

public class Run
{
    public static void main(String[] args)
    {
        Service service = new Service();
        MyThread1 thread1 = new MyThread1(service);
        MyThread2 thread2 = new MyThread2(service);
        //thread1.start();
        //thread2.start();

    }
}
