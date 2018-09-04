package com.pattern.design.facade.computer;

/**
 * Created by heron.lee 2018. 9. 3.
 */
public class Facade {

    public void init() {
        Power power = new Power();
        power.on();
        Cpu cpu = new Cpu();
        HardDisk hard = new HardDisk();
        Memory memory = new Memory();
        // ... add actions
    }
}
