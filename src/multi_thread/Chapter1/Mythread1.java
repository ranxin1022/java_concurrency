package multi_thread.Chapter1;

public class Mythread1 extends Thread {

    private int i;
    public Mythread1(int i){
        super();
        this.i = i;
    }

    public void run(){
        System.out.println(i);
    }
}
