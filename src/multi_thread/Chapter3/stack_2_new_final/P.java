package multi_thread.Chapter3.stack_2_new_final;

public class P
{
    private MyStack myStack;

    public P(MyStack myStack)
    {
        this.myStack = myStack;
    }

    public void pushService()
    {
        myStack.push();
    }
}
