package com.xworkz.practise.internal;

public class Raju {
    public void createAndUseWeapon() {
        weapon weapon = new weapon();
        weapon.use();
        weapon.fire();
    }

    public void createAndUseGun() {
        Gun gun = new Gun();
        gun.use();
        gun.fire();
    }

    public static void main(String[] args) {
        Raju raju = new Raju();
        raju.createAndUseWeapon();
        raju.createAndUseGun();
    }
}
