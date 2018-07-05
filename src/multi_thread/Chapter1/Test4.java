package multi_thread.Chapter1;

public class Test4 {
    public static void main(String[] args)
    {
        Mythread3 mythread3 = new Mythread3("test");
        Thread a = new Thread(mythread3, "A");
        Thread b = new Thread(mythread3, "B");
        Thread c = new Thread(mythread3, "C");

        a.start();
        b.start();
        c.start();
    }
}
