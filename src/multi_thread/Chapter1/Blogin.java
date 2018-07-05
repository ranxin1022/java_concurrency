package multi_thread.Chapter1;

public class Blogin extends Thread {
    public void run(){
        LoginServlet.doPost("b", "bb");
    }
}
