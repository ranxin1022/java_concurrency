package multi_thread.Chapter5.scheduleAtFixedRate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run2
{
    private static Timer timer = new Timer();

    public static class MyTask1 extends TimerTask
    {
        @Override
        public void run()
        {
            System.out.println(" 1 begin 运行了！ 时间为： " + new Date());
            System.out.println(" 1 end 运行了！ 时间为： " + new Date());
        }
    }

    public static void main(String[] args) throws ParseException
    {
        MyTask1 task1 = new MyTask1();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString1 = "2018-06-04 15:37:00";
        Date dateRef1 = sdf.parse(dateString1);
        System.out.println(" 字符串1 时间：" + dateRef1.toLocaleString() + " 当前时间： " + new Date().toLocaleString());
        timer.scheduleAtFixedRate(task1,dateRef1,5000);
    }
}
