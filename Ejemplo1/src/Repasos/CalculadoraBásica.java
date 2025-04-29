package Repasos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculadoraBásica {
    public static void main(String[] args) {
        int num1, num2, operacion;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        num1=lectura.nextInt();
        System.out.println("Ingrese el segundo número");
        num2=lectura.nextInt();
        System.out.println("Ingrese que operación desea realizar:\n1.Suma\n2.Resta\n3.Multiplicación\n4.División");
        operacion=lectura.nextInt();

        switch (operacion){
            case 1:
                System.out.println("SUMA");
                System.out.println("Resultado= " + (num1 + num2));
                break;
            case 2:
                System.out.println("RESTA");
                System.out.println("Resultado= " + (num1 - num2));
                break;
            case 3:
                System.out.println("MULTIPLICACIÓN");
                System.out.println("Resultado= " + (num1 * num2));
                break;
            case 4:
                System.out.println("DIVISIÓN");
                System.out.println("Resultado= " + (num1 / num2));
                System.out.println("Resto= " + (num1 % num2));
                break;
            case 5:
                System.out.println("NUMERO INVÁLIDO");
        }
    }
}
