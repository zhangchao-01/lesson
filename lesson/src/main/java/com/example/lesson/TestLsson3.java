package com.example.lesson;

public class TestLsson3 implements Runnable {

    private String  winner ;

    public void run() {
        for (int i = 0; i < 101; i++) {

            if (Thread.currentThread().getName().equals("兔子") && i%10 == 0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Boolean flage =  gameover(i);
            if (flage) {
                break;
            }
            System.out.println(Thread.currentThread().getName()+"-》》跑了"+i+"步");
        }
    }

    private boolean gameover(int steps){
        if (winner != null){
            return true;
        }else {
            if (steps >= 100){
                winner = Thread.currentThread().getName();
                System.out.println("winner is " + winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        TestLsson3  t = new TestLsson3();
        new Thread(t,"兔子").start();
        new Thread(t,"乌龟").start();
    }


}
