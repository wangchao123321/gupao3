package com.gupao.singleton;

import com.gupao.singleton.doublecheck.DoubleCheckSingleton;
import com.gupao.singleton.enums.EnumSingleton;
import com.gupao.singleton.lazy.HungrySingleton;
import com.gupao.singleton.staticinner.StaticInnerSingleton;

public class Client {

    public static void main(String[] args) {


        for (int i = 0; i < 500; i++) {
            new Thread(new Runnable() {
                public void run() {
                    // 饿汉式
//                    HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//                    DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
//                    StaticInnerSingleton staticInnerSingleton= StaticInnerSingleton.getInstance();
//                    System.out.println(staticInnerSingleton);
                }
            }).start();
        }


    }
}
