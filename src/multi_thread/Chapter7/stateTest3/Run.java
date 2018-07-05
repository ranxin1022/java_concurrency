package multi_thread.Chapter7.stateTest3;

public class Run
{

    public static void main(String[] args) throws InterruptedException
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
        System.out.println(" main 方法中t2 状态：" + t2.getState());

        Thread.sleep(3000);
        System.out.println(" main 方法中t2 状态：" + t2.getState());
    }
}
