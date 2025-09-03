package com.example.lesson;

public class TestLsson2 implements Runnable {

    //票数
    private int ticket = 10;

    public void run() {
        while (true) {
            if (ticket <= 0) {
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第："+ticket-- + "张票");
        }
    }

    public static void main(String[] args) {
        TestLsson2 ticket = new TestLsson2();
        new Thread(ticket,"小明").start();
        new Thread(ticket,"小暗").start();
        new Thread(ticket,"小红").start();
    }
}
