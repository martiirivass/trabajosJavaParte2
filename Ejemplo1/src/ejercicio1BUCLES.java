/*Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
Instrucciones:
•Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
•Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.
*/
import java.util.Scanner;

public class ejercicio1BUCLES {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalHoras = 0;
        int actividad = 1;

        while (actividad <= 4) {
            switch (actividad) {
                case 1:
                    System.out.print("Ingresa las horas dedicadas a estudiar: ");
                    break;
                case 2:
                    System.out.print("Ingresa las horas dedicadas a hacer ejercicios: ");
                    break;
                case 3:
                    System.out.print("Ingresa las horas dedicadas a leer: ");
                    break;
                case 4:
                    System.out.print("Ingresa las horas dedicadas a tiempo libre: ");
                    break;
            }

            double horas = scanner.nextDouble();
            totalHoras += horas;

            actividad++;
        }
        System.out.println("El tiempo total dedicado a las actividades es: " + totalHoras + " horas.");
    }
}