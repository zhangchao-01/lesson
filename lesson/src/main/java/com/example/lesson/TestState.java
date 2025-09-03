package com.example.lesson;

public class TestState implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestState  testState = new TestState();
        Thread thread = new Thread(testState);

        Thread.State state = thread.getState();
        System.err.println(state);

        thread.start();
        state = thread.getState();
        System.err.println(state);

        while (state != Thread.State.TERMINATED) {
            Thread.sleep(100);
            state = thread.getState();
            System.err.println(state);
        }
    }
}
