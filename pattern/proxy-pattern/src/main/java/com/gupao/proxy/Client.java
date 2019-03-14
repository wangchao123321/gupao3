package com.gupao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        Person person = new Man();
        InvocationHandler handler = new MyInvocationHandler(person);
        Person person1 = (Person)Proxy.newProxyInstance(handler.getClass().getClassLoader(), person
                .getClass().getInterfaces(), handler);
//        person.sayHello();
        person1.sayHello();

    }

}
