package multi_thread.Chapter1;

public class Suspend4
{
    private String username = "1";
    private String password = "22";

    public void setValue(String username, String password)
    {
        this.username = username;
        if(Thread.currentThread().getName().equals("a"))
        {
            System.out.println("停止a 线程");
            Thread.currentThread().suspend();
        }
        this.password = password;
    }

    public void printUsernamePassword()
    {
        System.out.println(username + ","  + password);
    }
}
