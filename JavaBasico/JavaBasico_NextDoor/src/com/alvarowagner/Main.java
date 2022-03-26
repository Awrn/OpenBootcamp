package com.alvarowagner;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Armas
        Weapon woodSword = new Weapon("WoodSword","Neutral",1,5,true);
        Weapon ironSword = new Weapon("IronSword","Neutral",3,10,false);
        Weapon fireSword = new Weapon("FireSword","fire",5,20,false);
        Weapon waterSword = new Weapon("WaterSword","water",7,30,false);
        Weapon voidSword = new Weapon("VoidSword","void",10,50,false);

        Weapon[] weapons = {woodSword, ironSword, fireSword,waterSword,voidSword};

        //Enemigos
        Enemy enemy = new Enemy();


        //Base Stats del jugador
        //.Showstats
        //.ShowHealth
        //.Attack

        Character pj = new Character("nombre",0,30,30,4,30,0,woodSword,0,0,weapons);
        Scanner scr = new Scanner(System.in);

        Start(pj,enemy,scr);


    }

    public static void Start(Character pj,Enemy enemy, Scanner scr) {

        //Inicio del juego

        System.out.println("*************** Bienvenido a Next Door ***************");
        System.out.println("Este es un proyecto que consiste en un mini juego por la terminal");
        System.out.println("Porfavor Introduce tu nombre: ");

        String nombre = scr.nextLine();
        pj.nombre = nombre;

        System.out.println("Hola " + pj.nombre + ", estos son tus stats:");
        pj.ShowPjStats();
        System.out.println("Ahora mismo dispones de la espada llamada " + pj.weapon.weaponName + " que tiene estos stats:");
        pj.ShowWeaponStats();

        System.out.println("Este juego consiste en abrir puertas y avanzar hasta llegar al nivel 10");
        System.out.println("subiras de nivel cada vez que derrotes enemigos");
        System.out.println("te puedes encontrar puertas de tesoros, curas o enemigos.");
        System.out.println("Buena suerte, empieza el juego.");
        System.out.println("---------------------------------");
        System.out.println("'Entras en una sala oscura con tres puertas'");
        System.out.println("Hmmm... Parece que siempre tendras que elegir entre tres puertas");
        SelectDoor(pj,enemy,scr);


    }

    public static void SelectDoor(Character pj,Enemy enemy, Scanner scr){

        //Ilusion de seleccionar una puerta

        System.out.println("Por que puerta quieres entrar? 1, 2 o 3");
        scr.next();
        DoorRandomizer(pj,enemy,scr);
        /*try {

            scr.nextInt();

            DoorRandomizer(pj,enemy,scr);
            System.out.println("bien");

        }catch (Exception e){
            scr.reset();
            System.out.println("porfavor introduce un numero valido" + e.getMessage());
            SelectDoor(pj,enemy,scr);
            System.out.println("mal");
        }*/

    }

    public static void DoorRandomizer(Character pj,Enemy enemy, Scanner scr){

        //Make random for enemy/chest/heal

        int enemyDoorPercent  = 60;
        int healthDoorPercenr = 20;
        int chestDoorPercent = 20;

        Random rand = new Random();

        int doorPercent = rand.nextInt(100);


        if(doorPercent < enemyDoorPercent){
            System.out.println("Has entrado en una sala con enemigos, cuidado!");
            DoorEnemy(pj,enemy,scr);

        }else if (doorPercent < healthDoorPercenr + enemyDoorPercent){
            System.out.println("Has entrado en una sala con unas pociones!");
            DoorHealth(pj,enemy,scr);

        }else{
            System.out.println("Has entrado en una sala con un cofre");
            DoorChest(pj,enemy,scr);

        }
    }

    public static void DoorEnemy(Character pj,Enemy enemy,Scanner scr){

        String eleccion;
        System.out.println("Hay un enemigo, que quieres hacer: 1 .atacar 2 .huir " );
        eleccion = scr.next();
        if(eleccion.equals("1")){


            GenerateEnemy(pj,scr);

        }else if(eleccion.equals("2")){

            SelectDoor(pj,enemy,scr);

        }else{
            SelectDoor(pj,enemy,scr);
        }

    }

    public static void GenerateEnemy(Character pj,Scanner scr) {

        Random rand = new Random();
        int nivel = pj.nivel + rand.nextInt(0,3);
        int attack = 2 + rand.nextInt(0,nivel+ rand.nextInt(0,4));
        int health = 10 + nivel * 2;

        Enemy enemy = new Enemy("",nivel, health ,attack,  10 + nivel * 4 );
        enemy.ShowEnemyStats();
        Combat(pj,enemy,scr);

    }

    public static void Combat(Character pj,Enemy enemy,Scanner scr){



        System.out.println("Que empiece el combate!");
        System.out.println("***********************");

        while(enemy.currentHealt > 0 && pj.currentHealt > 0){


            YourAttack(pj,enemy,scr);
            CheckCombat(pj,enemy,scr);
            EnemyAttack(pj,enemy,scr);
            CheckCombat(pj,enemy,scr);

        }


    }

    public static void CheckCombat(Character pj,Enemy enemy,Scanner scr){

        Random random = new Random();
        int llavePercent = 4;

        if(enemy.currentHealt <= 0){
            System.out.println("***********************");
            System.out.println("Has derrotado al enemigo!");
            pj.LevelUp(1);
            System.out.println("*Subes de nivel* Nivel: " + pj.nivel);
            TotalStats(pj,enemy,scr);
            if(pj.nivel >=10 ){
                Win(pj);
            }

            if(llavePercent > random.nextInt(0,10)){
                pj.key += 1;
                System.out.println("Has conseguido una llave!, tienes: " + pj.key);
                System.out.println("Continuemos!");
                System.out.println("");

                SelectDoor(pj,enemy,scr);

            }else{
                System.out.println("Continuemos!");
                System.out.println("");
                SelectDoor(pj,enemy,scr);
            }

        }else if(pj.currentHealt <= 0 ){
            Dead(pj,enemy,scr);

        }

    }

    public static void YourAttack(Character pj,Enemy enemy,Scanner scr){

        if(enemy.currentHealt > 0){
            enemy.currentHealt -=  pj.Attack();
        }

    }

    public static void EnemyAttack(Character pj,Enemy enemy,Scanner scr){

        if(pj.currentHealt > 0){
            pj.currentHealt -=  enemy.Attack();
        }

    }

    public static void DoorHealth(Character pj,Enemy enemy,Scanner scr){

        int healing = pj.maxHealth/4;
        System.out.println("te curas: " + healing);
        if(pj.currentHealt + healing <= pj.maxHealth){

            pj.currentHealt += healing;

        }else{
            pj.currentHealt = pj.maxHealth;
        }

        pj.ShowHealth();
        SelectDoor(pj,enemy,scr);
    }

    public static void DoorChest(Character pj,Enemy enemy,Scanner scr){



        System.out.println("Quieres intentar abrirlo? Y/N");
        String eleccion;
        eleccion = scr.next();

        if(eleccion.equals("y")) {

            if (pj.key != 0) {


                pj.key -= 1;

                if (pj.weaponState < pj.weapons.length -1) {

                    pj.weaponState += 1;
                    pj.weapon = pj.weapons[pj.weaponState];
                    System.out.println("Has conseguido la espada " + pj.weapon.weaponName);
                    pj.ShowWeaponStats();
                    System.out.println("Vamos a continuar");
                    SelectDoor(pj,enemy,scr);
                }else {
                    System.out.println("parece que ya tienes el mejor arma del juego");
                    SelectDoor(pj,enemy,scr);
                }

            } else {
                System.out.println("Vaya parece que no tienes llaves para abrir el cofre");
                System.out.println("Tendras que seguir hacia delante");
                SelectDoor(pj,enemy,scr);
            }

        }else if (eleccion.equals("n")){

            System.out.println("Vamos a continuar entonces");
            SelectDoor(pj,enemy,scr);

        }else {

            System.out.println("porfabor introduce la respuesta");
            DoorChest(pj,enemy,scr);
        }


    }

    public static void TotalStats(Character pj,Enemy enemy,Scanner scr) {

        int totalDps = pj.attackDamage + pj.weapon.attackDamage;
        int totalCritico = pj.critChance + pj.weapon.critChance;

        System.out.println("Tu vida es de " + pj.currentHealt + "/" +pj.maxHealth);
        System.out.println("Tu daño total es de: " + totalDps );
        System.out.println("Tu % Critico es de: " + totalCritico );
    }

    public static void Dead(Character pj,Enemy enemy,Scanner scr){
        System.out.println("***********************");
        System.out.println("Has muerto, volveras a la seleccion de puertas a full hp y se sumara 1 a el contador de muertes");
        System.out.println("------------------------------------------");


        pj.currentHealt = pj.maxHealth;
        pj.deathCount +=1 ;

        SelectDoor(pj,enemy,scr);
    }

    public static void Win(Character pj){

        System.out.println("Enhorabuena, has ganado!");
        System.out.println("Has muerto un total de: " + pj.deathCount + " veces.");
        System.out.println("Estos son tus stats finales");
        pj.ShowPjStats();
        pj.ShowWeaponStats();

        System.out.println("Fin");

        System.exit(0);

    }

}
