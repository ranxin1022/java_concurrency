package multi_thread.Chapter4.readWriteLockBegin4;

public class Run
{
    public static void main(String[] args)
    {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);

        threadA.setName("A");
        threadB.setName("B");
        threadB.start();
        threadA.start();
    }
}
