package multi_thread.Chapter1;

public class Sleep5 extends Thread {

    public void run(){
        super.run();
        for(int i = 0; i< 500000; i++)
        {
            if(this.interrupted()){
                System.out.println("stop station");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
    }
}
