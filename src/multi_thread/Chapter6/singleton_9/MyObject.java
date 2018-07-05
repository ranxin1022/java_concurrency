package multi_thread.Chapter6.singleton_9;

import java.util.Date;

public enum MyObject
{
    Red("红"),
    Green("绿");

    private String connection;

    private MyObject(String color)
    {
        connection = color;
    }

    public String getConnection()
    {
        return connection;
    }
}
