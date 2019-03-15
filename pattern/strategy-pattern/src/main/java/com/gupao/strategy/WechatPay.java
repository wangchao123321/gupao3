package com.gupao.strategy;

public class WechatPay implements Pay {
    public void pay() {
        System.out.println("微信支付");
    }
}
