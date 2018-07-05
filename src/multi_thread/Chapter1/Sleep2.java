package multi_thread.Chapter1;

public class Sleep2 extends Thread {

    public void run()
    {
        try
        {
            System.out.println("run ThreadName =" + this.currentThread().getName() + " begin = " + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run ThreadName =" + this.currentThread().getName() + " end = " + System.currentTimeMillis());

        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
