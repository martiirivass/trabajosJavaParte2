import java.util.Scanner;

/*Ejercicio 5: Cálculo de horas extras
Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
Instrucciones:
•	Pide al usuario ingresar el número de empleados.
•	Usa un bucle para ingresar las horas trabajadas por cada empleado.
•	Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.
*/
public class ejercicio5BUCLES {
    public static void main(String[] args) {
        int numEmpleados, horasTrabajadas;   //Defino variables
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados que tiene:");
        numEmpleados= lectura.nextInt();

        while (numEmpleados>0){
            System.out.println("\nIngrese la cantidad de horas trabajadas por el empleado "+ numEmpleados);
            horasTrabajadas=lectura.nextInt();
            if (horasTrabajadas>40){
                System.out.println("La cantidad de horas extra de dicho empleado son: "+ (horasTrabajadas-40) + " horas");
            }
            else{
                System.out.println("Este empleado no cuenta con horas extra");
            }
            numEmpleados--;
        }
    }
}
