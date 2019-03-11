package com.gupao.factory.methodfactory;

import com.gupao.factory.simplefactory.Computer;
import com.gupao.factory.simplefactory.HuiPu;

public class HuiPuFactory implements ComputerFacotry {
    public Computer getComputer() {
        return new HuiPu();
    }
}
