package com.alvarowagner;

import java.util.Arrays;
import java.util.Random;

public class Character implements CombatNeeds {

    String nombre;
    int nivel;

    int maxHealth;
    int currentHealt;

    int attackDamage;
    int critChance;

    int key;
    int weaponState;
    int deathCount;

    Weapon[] weapons;

    Weapon weapon;


    public static void main(String[] args) {

    }

    public Character() {
    }

    public Character(String nombre, int nivel, int maxHealth, int currentHealt, int attackDamage, int critChance,int key, Weapon weapon,int weaponState,int deathCount, Weapon[] weapons) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.maxHealth = maxHealth;
        this.currentHealt = currentHealt;
        this.attackDamage = attackDamage;
        this.critChance = critChance;
        this.weapon = weapon;
        this.weaponState = weaponState;
        this.key = key;
        this.weapons = weapons;
        this.deathCount = deathCount;
    }

    public  void ShowStats(){
        System.out.println("");
        System.out.println("-----------Stats------------");
        System.out.println("nivel:" + nivel + " " + "VidaActual:" + currentHealt + "/" +maxHealth + " " +" Daño:" + attackDamage+ " " +"Probabilidad de Crítico:" + critChance + "%");
        System.out.println("----------------------------");
        System.out.println("");
    }

    public  void ShowHealth(){
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("VidaActual: " + currentHealt + "/" +maxHealth);
        System.out.println("----------------------------");
        System.out.println("");
    }

    public  void ShowWeaponStats(){

        System.out.println("-----------Stats------------");
        System.out.println("Espada: " + weapon.weaponName);
        System.out.println("Tipo:" + weapon.type + " " + "Daño:" + weapon.attackDamage + " " + "Porcentaje Crítico:" + weapon.critChance + "%" );
        System.out.println("--------------");
    }

    public  void LevelUp(int level){

        nivel += level;
        maxHealth +=5;
        attackDamage +=1;
        critChance += 3;
    }

    public int Attack(){

        Random rand = new Random();
        int random_upper = 100;
        int damage= 0;
        int critdamage= 0;
        int critChanceFinal = 0;


        damage = (attackDamage + weapon.attackDamage);
        critChanceFinal = critChance + weapon.critChance;
        if(rand.nextInt(random_upper) <= critChanceFinal) {
            critdamage = damage + (damage/2);
            System.out.println("Atacas al enemigo con un ataque critico de: " +  critdamage);
        }else {
            System.out.println("Atacas al enemigo con un ataque de: " +  damage);
            return damage;


        }
        return critdamage;
    }

    @Override
    public String toString() {
        return "Character{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", maxHealth=" + maxHealth +
                ", currentHealt=" + currentHealt +
                ", attackDamage=" + attackDamage +
                ", critChance=" + critChance +
                ", key=" + key +
                ", weaponState=" + weaponState +
                ", deathCount=" + deathCount +
                ", weapons=" + Arrays.toString(weapons) +
                ", weapon=" + weapon +
                '}';
    }
}
