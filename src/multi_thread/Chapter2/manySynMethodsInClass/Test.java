package multi_thread.Chapter2.manySynMethodsInClass;

public class Test
{
    public static void main(String[] args)
    {
        Service s = new Service();

        ThreadA threadA = new ThreadA(s);
        ThreadB threadB = new ThreadB(s);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
