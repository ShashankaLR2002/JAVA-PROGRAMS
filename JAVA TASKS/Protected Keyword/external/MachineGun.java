package com.xworkz.practise.external;

import com.xworkz.practise.internal.weapon;

public class MachineGun extends weapon {
    @Override
    public void use() 
    {
    	System.out.println("machinegun is being used");
    }

    @Override
    public void fire() 
    {
    System.out.println("Firing in machine gun");
    }

    public void invokeMethods() {
        use();
        fire();
    }
}