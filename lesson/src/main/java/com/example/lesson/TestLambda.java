package com.example.lesson;

public class TestLambda {

    static class Like2 implements ILike{
        public void Lambda() {
            System.out.println("lambda2");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.Lambda();

        like = new Like2();
        like.Lambda();

        //j局部内部类
        class Like3 implements ILike{
            public void Lambda() {
                System.out.println("lambda3");
            }
        }

        like = new Like3();
        like.Lambda();

        //匿名内部类
        like = new ILike() {
            public void Lambda() {
                System.out.println("lambda4");
            }
        };
        like.Lambda();


        //
        like = ()->{
            System.out.println("lambda5");
        };
    }

}
//定义一个函数式接口
interface ILike{
    void Lambda();
}

class Like implements ILike{
    public void Lambda() {
        System.out.println("lambda1");
    }
}