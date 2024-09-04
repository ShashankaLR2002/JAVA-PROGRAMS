package com.xworkz.practise.internal;

public class Gun extends weapon {
    @Override
	public void use() {
        System.out.println("Gun is being used.");
    }

    @Override
    public void fire() {
        System.out.println("Gun fired.");
    }

    public void invokeMethods() {
        use();
        fire();
    }

    public static void main(String[] args) {
        Gun gun = new Gun();
        gun.invokeMethods();
    }
}
