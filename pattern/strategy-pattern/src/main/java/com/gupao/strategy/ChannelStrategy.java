package com.gupao.strategy;

public class ChannelStrategy {

    private Pay pay;

    public ChannelStrategy(Pay pay) {
        this.pay = pay;
    }

    public void toPay(){
        pay.pay();
    }
}
