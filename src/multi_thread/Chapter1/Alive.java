package multi_thread.Chapter1;

public class Alive extends Thread{

    public void run()
    {
        System.out.println("run = " + this.isAlive());
    }
}
