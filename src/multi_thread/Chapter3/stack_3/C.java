package multi_thread.Chapter3.stack_3;

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
