package Repasos;

import javax.swing.*;
import java.util.Scanner;

public class NumeroParOImpar {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para saber si es par o impar"));
        if (num%2==0){
            JOptionPane.showMessageDialog(null,"El número es PAR");
        } else {
            JOptionPane.showMessageDialog(null,"El número es IMPAR");
        }
    }
}
