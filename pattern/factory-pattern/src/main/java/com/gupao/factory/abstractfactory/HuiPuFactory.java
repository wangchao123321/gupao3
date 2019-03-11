package com.gupao.factory.abstractfactory;

import com.gupao.factory.simplefactory.Computer;
import com.gupao.factory.simplefactory.HuiPu;

public class HuiPuFactory implements AbstractFactory {
    public Board getBoard() {
        return new JiJia();
    }

    public Computer getComputer() {
        return new HuiPu();
    }
}
