package multi_thread.Chapter3.TwoThreadTransData;

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
