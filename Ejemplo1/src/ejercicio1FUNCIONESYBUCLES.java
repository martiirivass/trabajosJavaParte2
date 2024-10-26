/*Ejercicio 1: Cálculo de ingresos mensuales
Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una función que use un bucle para calcular los ingresos totales mensuales.

**Instrucciones**:
- Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
- Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
- Imprime el total de ingresos mensuales.
*/

import java.util.Scanner;

public class ejercicio1FUNCIONESYBUCLES{
    public static void main(String[] args) {

        Scanner lectura=new Scanner(System.in);

        int[] ventasDiarias=new int[30];  //CREAMOS EL ARREGLO VENTASDIARAS

        for (int i=0 ; i<30 ; i++){
            System.out.println("Ingrese la venta del dia "+ i);
            ventasDiarias[i]= lectura.nextInt();
        }
        System.out.println("La suma total de los ingresos mensuales es de: $"+ calcularIngresosMensuales(ventasDiarias));   //Llamo a la funcion



    }

    //funcion para sumar las ventas diarias
    public static int calcularIngresosMensuales(int[] ventasDiarias){

        int ventasTotales = 0, resultado;
        for (int i=0; i<30; i++){
            ventasTotales=ventasTotales+ventasDiarias[i];
        }
        resultado=ventasTotales;
        return resultado;
    }
}
