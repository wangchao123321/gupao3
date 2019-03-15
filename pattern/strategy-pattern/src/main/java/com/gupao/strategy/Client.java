package com.gupao.strategy;

public class Client {

    public static void main(String[] args) {

        Pay pay = new AliPay();
        new ChannelStrategy(pay).toPay();
    }
}
