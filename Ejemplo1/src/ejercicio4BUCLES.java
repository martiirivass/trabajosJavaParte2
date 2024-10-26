import java.util.Scanner;

/*Ejercicio 4: Registro de ventas diarias
Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular el total de ventas al final de la semana.
Instrucciones:
•	Usa un bucle para registrar las ventas diarias durante 7 días.
•	Al final del bucle, muestra el total de ventas de la semana.
*/
public class ejercicio4BUCLES {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int totalVentasSemana = 0, ventas, menu=1;
        System.out.println("MENÚ REGISTRO DE VENTAS");
        do {
            totalVentasSemana=0;   //RESETEA SI ES QUE VUELVEN A HACER OTRO REGISTRO
            for (int i = 0; i < 7; i++) {
                System.out.println("Ingrese el número de ventas del dia " + diasSemana[i]);
                ventas = lectura.nextInt();
                totalVentasSemana = totalVentasSemana + ventas;
            }
            System.out.println("El total de ventas semanales es de: " + totalVentasSemana);
            System.out.println("\n¿Desea realizar otro registro de venta?\n1.Realizar otro registro\n2.Salir");
            menu = lectura.nextInt();
        }while (menu == 1) ;
    }
}


