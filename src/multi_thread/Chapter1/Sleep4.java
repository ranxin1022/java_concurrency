package multi_thread.Chapter1;

public class Sleep4 extends Thread {

    public void run(){
        super.run();
        for(int i = 0; i< 500000; i++)
        {
            System.out.println("i=" + (i + 1));
        }
    }
}
