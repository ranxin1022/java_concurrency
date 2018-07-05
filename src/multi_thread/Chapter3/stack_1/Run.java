package multi_thread.Chapter3.stack_1;

public class Run
{
    public static void main(String[] args)
    {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);

        P_Thread p_thread = new P_Thread(p);
        C_Thread c_thread = new C_Thread(c);

        p_thread.start();
        c_thread.start();
    }
}
