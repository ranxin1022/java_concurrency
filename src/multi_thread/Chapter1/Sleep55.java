package multi_thread.Chapter1;

public class Sleep55 extends Thread {
    public void run()
    {
        super.run();

        for(int i = 0; i < 500000; i++)
        {
            if(this.isInterrupted())
            {
                System.out.println("i am interrupted!");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                break;


            }
            System.out.println("i=" + (i + 1));
        }
    }
}
