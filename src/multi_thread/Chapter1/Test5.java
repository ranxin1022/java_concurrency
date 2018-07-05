package multi_thread.Chapter1;

public class Test5 {

    public static void main(String[] args)
    {

        Alogin a = new Alogin();
        a.start();
        Blogin b = new Blogin();
        b.start();

    }
}
