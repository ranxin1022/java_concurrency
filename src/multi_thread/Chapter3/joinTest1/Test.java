package multi_thread.Chapter3.joinTest1;

public class Test
{
    public static void main(String[] args)
    {
        MyThread threadTest = new MyThread();
        threadTest.start();

        //Thread.sleep(?);
        System.out.println("我想当threadTest 对象执行完毕后再执行");
        System.out.println("但上面的代码中sleep() 中的值应该多少");
        System.out.println("答案是： 不能确定");
    }
}
