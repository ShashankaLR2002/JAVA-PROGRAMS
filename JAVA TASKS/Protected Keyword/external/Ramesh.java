package com.xworkz.practise.external;

import com.xworkz.practise.internal.Gun;
import com.xworkz.practise.internal.weapon;

public class Ramesh {
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
        Ramesh ramesh = new Ramesh();
        ramesh.createAndUseWeapon();
        ramesh.createAndUseGun();
    }
}
