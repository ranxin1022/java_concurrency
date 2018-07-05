package multi_thread.Chapter1;

public class Sleep6 extends Thread {
    public void run()
    {
        super.run();

        for(int i = 0; i < 500000; i++)
        {
            if(this.isInterrupted())
            {
                System.out.println("sleep6 i am interrupted!");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println("print out");
    }
}
