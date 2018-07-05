package multi_thread.Chapter1;

public class CountOperate extends Thread {

    public CountOperate(String name){
        this.setName(name);
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread.getName()==" + Thread.currentThread().getName());

        System.out.println("Thread.currentThread.isAlive()==" + Thread.currentThread().isAlive());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("CountOperate---end");
    }

    public void run(){
        System.out.println("run --- begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread.isAlive()==" + Thread.currentThread().isAlive());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("run --- end");
    }
}
