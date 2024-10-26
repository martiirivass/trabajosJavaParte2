import java.util.Scanner;

/*Ejercicio 2: Cálculo de salarios semanales
Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
Instrucciones:
•	Pide al usuario ingresar la cantidad de empleados.
•	Para cada empleado, pide ingresar las horas trabajadas.
•	Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).*/
public class ejercicio2BUCLES {
    public static void main(String[] args) {
        int tarifafija=15,cantidad_empleados, horas_trabajadas;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados que tiene en su empresa:");
        cantidad_empleados= lectura.nextInt();

        for (int i = 1; i <= cantidad_empleados; i++) {
            System.out.print("Ingresa las horas trabajadas por el empleado " + i + ": ");
            horas_trabajadas = lectura.nextInt();
            double salarioSemanal = horas_trabajadas * tarifafija;
            System.out.println("El salario semanal del empleado " + i + " es: $" + salarioSemanal);
        }
    }
}
