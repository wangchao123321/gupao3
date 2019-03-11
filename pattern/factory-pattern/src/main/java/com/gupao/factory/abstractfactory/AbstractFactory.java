package com.gupao.factory.abstractfactory;

import com.gupao.factory.simplefactory.Computer;

public interface AbstractFactory {

    Board getBoard();

    Computer getComputer();
}
