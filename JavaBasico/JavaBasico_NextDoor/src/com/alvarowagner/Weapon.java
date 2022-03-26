package com.alvarowagner;

public class Weapon {

    String weaponName;
    String type;
    int attackDamage = 1;
    int critChance = 10;
    boolean hasWeapon;

    public Weapon(String weaponName, String type, int attackDamage, int critChance, boolean hasWeapon) {
        this.weaponName = weaponName;
        this.type = type;
        this.attackDamage = attackDamage;
        this.critChance = critChance;
        this.hasWeapon = false;
    }

    @Override
    public String toString() {
        return "Weapons{" +
                "weaponName='" + weaponName + '\'' +
                ", type='" + type + '\'' +
                ", attackDamage=" + attackDamage +
                ", critChance=" + critChance +
                '}';
    }
}
