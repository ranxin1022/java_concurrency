package multi_thread.Chapter4.z3_ok;

public class Run
{

    public static void main(String[] args)
    {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
