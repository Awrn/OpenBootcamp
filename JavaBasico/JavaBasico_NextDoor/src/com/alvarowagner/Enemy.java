package com.alvarowagner;

import java.util.Random;

public class Enemy {

    String type;
    int nivel = 1;


    int currentHealt = 3;

    int attackDamage = 2;
    int critChance = 10;


    public Enemy() {
    }

    public Enemy(String type, int nivel, int currentHealt, int attackDamage, int critChance) {
        this.type = type;
        this.nivel = nivel;
        this.currentHealt = currentHealt;
        this.attackDamage = attackDamage;
        this.critChance = critChance;
    }

    public  void ShowEnemyStats(){
        System.out.println("");
        System.out.println("Enemy| " + "nivel:" + nivel + " " + "vida:" + currentHealt + " " + "Daño:" + attackDamage + " " + "Probabilidad de Crítico:" + critChance + "%");
        System.out.println("");
    }

    public int Attack(){


        Random rand = new Random();
        int random_upper = 100;
        int damage= 0;
        int critdamage= 0;
        int critChanceFinal = 0;


        damage = (attackDamage + nivel);
        critChanceFinal = critChance + (nivel * 10);

        if(rand.nextInt(random_upper) <= critChanceFinal) {
            critdamage = damage + (damage/2);
            System.out.println("Te golpean con un ataque Critico de: " +critdamage);
            return critdamage;

        }else {
            System.out.println("Te golpean con un ataque de: " + damage);
            return damage;
        }


    }

    @Override
    public String toString() {
        return "Enemy{" +
                "type='" + type + '\'' +
                ", nivel=" + nivel +
                ", currentHealt=" + currentHealt +
                ", attackDamage=" + attackDamage +
                ", critChance=" + critChance +
                '}';
    }
}
