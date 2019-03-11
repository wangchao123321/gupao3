package com.gupao.factory.simplefactory;

public class Client {


    public static void main(String[] args) {
        Computer dell = SimpleFactory.getComputer("dell");
        dell.work();
        Computer huipu = SimpleFactory.getComputer("huipu");
        huipu.work();
        Computer fangzheng = SimpleFactory.getComputer("fangzheng");
        fangzheng.work();
    }
}
