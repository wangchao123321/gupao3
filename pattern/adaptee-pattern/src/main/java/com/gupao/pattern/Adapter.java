package com.gupao.pattern;

public class Adapter extends User implements Login {

    public void login() {
        newLogin();
    }
}
