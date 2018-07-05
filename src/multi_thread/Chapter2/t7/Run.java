package multi_thread.Chapter2.t7;

public class Run
{
    public static void main(String[] args)
    {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        MyThread2 thread2 = new MyThread2(task);

        thread1.setName("A");
        thread2.setName("B");
        thread1.start();
        thread2.start();

    }
}
