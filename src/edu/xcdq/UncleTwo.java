package edu.xcdq;

/**
 * @author wangwenbo
 * @data 2021/4/24 20:46
 */
    public class UncleTwo extends Uncle{
        public UncleTwo() {
            //super();
            System.out.println("二舅的构造方法被创建");
        }

        // 独有的方法
        public void hejiu() {
            System.out.println("二舅喜欢喝酒");
        }
        // 复写（覆写）Override 父类中的方法
        public void faHongbao() {
            System.out.println("家道中落，不发红包，改送祝福");
        }

    }

