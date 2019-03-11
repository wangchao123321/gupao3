package com.gupao.factory.simplefactory;

public class SimpleFactory {

    public static Computer getComputer(String type){
        if("huipu".equals(type)){
            return new HuiPu();
        }else if("dell".equals(type)){
            return new Dell();
        }else{
            System.out.println("错误");
            return null;
        }

    }

}
