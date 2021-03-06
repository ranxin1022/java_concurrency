package multi_thread.Chapter5.timerTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run1TimerIsDaemon
{
    private static Timer timer = new Timer(true);

    static public class  MyTask extends TimerTask
    {
        @Override
        public void run()
        {
            System.out.println(" 运行了！ 时间为： " + new Date());
        }
    }


    public static void main(String[] args) throws ParseException
    {
        MyTask task = new MyTask();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = "2018-06-04 13:54:00";
        Date dateRef = sdf.parse(dateString);
        System.out.println("字符串时间： " + dateRef.toLocaleString() + " 当前时间： " + new Date().toLocaleString());
        timer.schedule(task, dateRef);
    }
}
