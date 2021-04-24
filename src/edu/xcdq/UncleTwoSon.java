package edu.xcdq;

/**
 * @author wangwenbo
 * @data 2021/4/24 20:49
 */
// 多层继承
public class UncleTwoSon extends UncleTwo{
    public UncleTwoSon() {
        // super(); // 调用的父类的构造方法
        System.out.println("二舅的儿子类被创建了");
    }

    public void faHongbao() {
        System.out.println("逆袭了，红包接着发");
    }

}

