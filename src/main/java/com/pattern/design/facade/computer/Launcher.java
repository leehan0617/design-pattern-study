package com.pattern.design.facade.computer;

/**
 * Created by heron.lee 2018. 9. 4.
 */
public class Launcher {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.init();
    }
}
