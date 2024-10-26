/*Ejercicio 3: Control de inventario
Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene menos de 5 unidades disponibles para realizar un pedido.
Instrucciones:
•	Pide al usuario ingresar el número de productos.
•	Usa un bucle para ingresar la cantidad disponible de cada producto.
•	Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.
*/

import java.util.Scanner;

public class ejercicio3BUCLES {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese el número de productos que tiene en su inventario:");
        int productos= lectura.nextInt();
        for (int i = 1; i <= productos; i++) {
            System.out.println("\nIngrese la cantidad dispoible del producto "+ i + ":" );
            int stock= lectura.nextInt();
            if (stock<5) {
                System.out.println("Es hora de realizar un pedido para actualizar el stock.");
                }
            else {
                System.out.println("Todavia tiene stock.");
            }
        }
    }
}
