package multi_thread.Chapter5.timerTest5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run1
{
    private static Timer timer =  new Timer();
    private static int runCount = 0;

    static public class  MyTask1 extends TimerTask
    {
        @Override
        public void run()
        {
            try
            {
                System.out.println(" 1 begin 运行了！ 时间为： " + new Date());
                Thread.sleep(1000);
                System.out.println(" 1 end 运行了！ 时间为： " + new Date());
                runCount++;
                if(runCount == 5)
                {
                    timer.cancel();
                }

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }


    public static void main(String[] args) throws ParseException
    {
        MyTask1 task = new MyTask1();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = "2018-06-04 13:51:00";
        Date dateRef = sdf.parse(dateString);
        System.out.println("字符串时间： " + dateRef.toLocaleString() + " 当前时间： " + new Date().toLocaleString());
        timer.schedule(task,dateRef,3000);
    }
}
