package multi_thread.Chapter3.stack_2_new_final;

public class C
{
    private MyStack myStack;

    public C(MyStack myStack)
    {
        this.myStack = myStack;
    }

    public void popService()
    {
        System.out.println("pop = " + myStack.pop());
    }
}
