package multi_thread.Chapter3.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

public class MyList
{
    private List list = new ArrayList();

    public void add()
    {
        list.add("test1");
    }

    public int size()
    {
        return list.size();
    }
}
