package calculadora;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Calcular();

    }



    public static void  Calcular(){

        float num1;
        float num2;
        String operacion = "";
        Operaciones op = new Operaciones();

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce el numero");

        num1 = scanner.nextFloat();

        System.out.println("introduce la operacion");
        operacion = scanner.next();

        switch (operacion) {

            case "+":
                System.out.println("segundo numero");
                num2 = scanner.nextFloat();
                System.out.println(op.Sumar(num1,num2));
                System.out.println("------------------");
                Calcular();
                break;


            case "-":
                System.out.println("segundo numero");
                num2 = scanner.nextFloat();
                System.out.println(op.Restar(num1,num2));
                System.out.println("------------------");
                Calcular();
                break;

            case "/":
                System.out.println("segundo numero");
                num2 = scanner.nextFloat();
                System.out.println(op.Dividir(num1,num2));
                System.out.println("------------------");
                Calcular();
                break;
            case "%":
                System.out.println("segundo numero");
                num2 = scanner.nextFloat();
                System.out.println(op.Resto(num1,num2));
                System.out.println("------------------");
                Calcular();
                break;

            default :
                System.out.println("Introduce una operacion valida");
                System.out.println("------------------");
                Calcular();

        }



    }


}
