package Repasos;

import javax.swing.*;
import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int numInt;
        System.out.println("Ingrese un número para conocer su tabla de multiplicar");
        numInt = lectura.nextInt();
        for (int i=0 ; i<=10; i++) {
            System.out.println("RESULTADO= " + (numInt*i));
        }
    }
}
