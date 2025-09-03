package com.example.lesson;

public class TestLsson1 extends Thread {

    @Override
    public void run() {
        //
        for(int i=0;i<10;i++) {
            System.out.println("子线程"+i);
        }
    }

    public static void main(String[] args) {

        TestLsson1 testLsson1 = new TestLsson1();
        testLsson1.start();

        for(int i=0;i<10;i++) {
            System.out.println("主线程的"+i);
        }
    }
}
