package multi_thread.Chapter3.p_c_allWait;

public class C
{
    private String lock;

    public C(String lock)
    {
        this.lock = lock;
    }

    public void getValue()
    {
        try
        {
            synchronized (lock)
            {
                while (ValueObject.value.equals(""))
                {
                    System.out.println("消费者 " + Thread.currentThread().getName() + " waiting 了 *");
                    lock.wait();
                }
                System.out.println("消费者 " + Thread.currentThread().getName() + " runnable 了 *");
                ValueObject.value = "";
                lock.notify();
            }
        }
        catch (InterruptedException e)
        {

        }
    }
}
