package multi_thread.Chapter2.syn_Out_asyn;

public class Run
{
    public static void main(String[] args)
    {
        MyList myList = new MyList();
        ThreadA a = new ThreadA(myList);
        ThreadB b = new ThreadB(myList);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
    }
}
