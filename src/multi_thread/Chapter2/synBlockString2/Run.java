package multi_thread.Chapter2.synBlockString2;

public class Run
{
    public static void main(String[] args)
    {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
    }
}
