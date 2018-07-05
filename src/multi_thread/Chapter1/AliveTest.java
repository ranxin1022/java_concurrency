package multi_thread.Chapter1;

public class AliveTest {

    public static void main(String[] args)
    {
        Alive alive = new Alive();
        System.out.println("begin == " + alive.isAlive());
        alive.start();
        System.out.println("end ==" + alive.isAlive());
    }
}
