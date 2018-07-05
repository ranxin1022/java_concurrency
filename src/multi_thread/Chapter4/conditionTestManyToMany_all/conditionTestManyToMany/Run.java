package multi_thread.Chapter4.conditionTestManyToMany_all.conditionTestManyToMany;

public class Run
{
    public static void main(String[] args)
    {
        MyService service = new MyService();
        ThreadA[] a = new ThreadA[10];
        ThreadB[] b = new ThreadB[10];

        for(int i = 0; i< 10; i++)
        {
            a[i] = new ThreadA(service);
            b[i] = new ThreadB(service);
            a[i].start();
            b[i].start();
        }
    }
}
