import java.util.Scanner;

/*Ejercicio 1: Cálculo de ingresos mensuales
Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una función que use un bucle para calcular los ingresos totales mensuales.

**Instrucciones**:
- Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
- Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
- Imprime el total de ingresos mensuales.
*/
public class ejercicio1FUNCIONESYBUCLES {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int ventasTotales=0;
        int[] ventas=new int[30];  //ARREGLO PARA LOS 30 DIAS
        for (int i=1; i<31; i++){
            System.out.println("Ingrese la venta " + i);
            ventas[i]=lectura.nextInt();
        }
        System.out.println(ventas[1]);



    }
}
