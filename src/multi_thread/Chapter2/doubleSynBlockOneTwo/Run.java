package multi_thread.Chapter2.doubleSynBlockOneTwo;

public class Run
{

    public static void main(String[] args)
    {
        ObjectService service = new ObjectService();
        ThreadA a = new ThreadA(service);

        ThreadB b = new ThreadB(service);

        a.setName("a");
        b.setName("b");
        a.start();
        b.start();
    }
}
