package multi_thread.Chapter1;

public class Run {
    public static void main(String[] args)
    {
        Mythread mythread = new Mythread();
        mythread.start();
        System.out.println("run finished");
    }
}
