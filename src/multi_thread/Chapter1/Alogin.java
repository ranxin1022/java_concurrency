package multi_thread.Chapter1;

public class Alogin extends Thread {
    public void run()
    {
        LoginServlet.doPost("a", "aa");
    }
}
