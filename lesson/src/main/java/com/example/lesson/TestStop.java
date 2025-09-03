package com.example.lesson;

//测试停止线程
//设置标志位
//不使用stop或者destroy
public class TestStop implements Runnable {

    //设置标志位
    private Boolean flag = true;
    @Override
    public void run() {

        int i = 0;
        while (flag) {
            System.err.println("run.......Thre"+ i++);
        }

    }

    //设置公开方法停止线程，转换标志位
    public void Stop(){
        this.flag = false;
    }
    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        Thread thread = new Thread(testStop);
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.err.println("main" + i);
            if (i == 900) {
                testStop.Stop();
                System.err.println("线程stop");
            }
        }
    }
}
