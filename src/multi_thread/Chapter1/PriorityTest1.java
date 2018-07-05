package multi_thread.Chapter1;

public class PriorityTest1
{
    public static void main(String[] args)
    {
        Priority1 priority1 = new Priority1();
        priority1.setPriority(6);
        priority1.start();
    }
}
