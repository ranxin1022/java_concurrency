package multi_thread.Chapter1;

public class Test1 {
    public static void main(String[] args)
    {
        Mythread1 thread1 = new Mythread1(1);
        Mythread1 thread2 = new Mythread1(2);
        Mythread1 thread3 = new Mythread1(3);
        Mythread1 thread4 = new Mythread1(4);
        Mythread1 thread5 = new Mythread1(5);
        Mythread1 thread6 = new Mythread1(6);
        Mythread1 thread7 = new Mythread1(7);
        Mythread1 thread8 = new Mythread1(8);
        Mythread1 thread9 = new Mythread1(9);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
    }
}
