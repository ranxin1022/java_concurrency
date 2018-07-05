package multi_thread.Chapter2.twoObjectTwoLock;

public class Run
{
    public static void main(String[] args)
    {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef1);
        ThreadB threadB = new ThreadB(numRef2);
        threadA.start();
        threadB.start();
    }
}
