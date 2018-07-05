package multi_thread.Chapter1;

public class Test3 {
    public static void main(String[] args)
    {
        Mythread3 a = new Mythread3("a");
        Mythread3 b = new Mythread3("b");
        Mythread3 c = new Mythread3("c");

        a.start();
        b.start();
        c.start();
    }
}
