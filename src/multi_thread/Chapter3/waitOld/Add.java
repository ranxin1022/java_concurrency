package multi_thread.Chapter3.waitOld;

// 加法
public class Add
{
    private String lock;

    public Add(String lock)
    {
        this.lock = lock;
    }

    public void add()
    {
        synchronized (lock)
        {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
