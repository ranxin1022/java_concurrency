package multi_thread.Chapter2.synBlockString;

public class Run
{
    public static void main(String[] args)
    {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
