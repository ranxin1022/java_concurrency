package multi_thread.Chapter7.formatOK;

import java.text.SimpleDateFormat;

public class Run
{
    public static void main(String[] args)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray = new String[]{"2000-01-01","2000-01-02","2000-01-03","2000-01-04","2000-01-05","2000-01-06"};
        MyThread[] threadArray = new MyThread[dateStringArray.length];
        for(int i = 0 ;i < dateStringArray.length; i++)
        {
            threadArray[i] = new MyThread(sdf, dateStringArray[i]);
        }

        for(int i = 0 ;i < dateStringArray.length; i++)
        {
            threadArray[i].start();
        }
    }
}
