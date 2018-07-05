package multi_thread.Chapter1;

public class Stop1 extends Thread {

    public void run(){
        super.run();
        for(int i = 0; i<50000000;i ++)
        {
            System.out.println("i=" + (i+1));
        }
    }
}
