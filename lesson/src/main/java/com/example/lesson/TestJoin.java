package com.example.lesson;

public class TestJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.err.println("vip");
        }
    }



    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread1 = new Thread(testJoin);


        for (int i = 0; i < 500; i++) {
            if (i == 100){
                thread1.start();
                thread1.join();

            }
            System.err.println("main"+i);
        }
    }
}
