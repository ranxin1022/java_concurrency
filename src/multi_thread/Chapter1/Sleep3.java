package multi_thread.Chapter1;

public class Sleep3 extends Thread{
    public void run()
    {
        super.run();
        for(int i = 0 ; i < 50000; i++)
        {
            System.out.println("i = " + (i + 1));
        }
    }
}