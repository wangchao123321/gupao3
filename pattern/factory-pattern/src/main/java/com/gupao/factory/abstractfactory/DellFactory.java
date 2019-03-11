package com.gupao.factory.abstractfactory;

import com.gupao.factory.simplefactory.Computer;
import com.gupao.factory.simplefactory.Dell;

public class DellFactory implements AbstractFactory {
    public Board getBoard() {
        return new HuaShuo();
    }

    public Computer getComputer() {
        return new Dell();
    }
}
