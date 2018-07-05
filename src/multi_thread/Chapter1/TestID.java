package multi_thread.Chapter1;

public class TestID {

    public static void main(String[] args)
    {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " " + thread.getId());
    }
}
