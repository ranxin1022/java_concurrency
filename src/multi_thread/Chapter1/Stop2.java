package multi_thread.Chapter1;

public class Stop2 extends Thread {

    public void run(){

        super.run();
        try{
            for(int i = 0; i<50000000;i ++)
            {

                if(this.isInterrupted())
                {
                    System.out.println("I am interrupted,");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i+1));
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
