package multi_thread.Chapter1;

public class AliveTest2 {

    public static void main(String[] args) throws InterruptedException
    {
        Alive alive = new Alive();
        System.out.println("begin==" + alive.isAlive());
        alive.start();
        Thread.sleep(1000);
        System.out.println("end ==" + alive.isAlive());
    }
}
