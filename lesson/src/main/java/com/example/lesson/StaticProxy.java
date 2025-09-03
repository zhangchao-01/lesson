package com.example.lesson;
//代理方式实现线程原理
public class StaticProxy {
    public static void main(String[] args) {
        WeddingCompany weddingCompany = new WeddingCompany(new You());
        weddingCompany.HappyMarry();
    }
}
interface Marry {

    void HappyMarry();
}

//真实角色
class You implements Marry {

    public void HappyMarry() {
        System.out.println("本人去结婚");
    }
}

//代理角色
class WeddingCompany implements Marry {

    private Marry target;
    public WeddingCompany(Marry target) {
        this.target = target;
    }

    public void HappyMarry() {
        brfore();
        this.target.HappyMarry();
        after();
    }

    private void after() {
        System.out.println("结婚之后，收尾款");
    }

    private void brfore() {
        System.out.println("结婚之前，布置现场");
    }
}