import java.util.Scanner;

/*Ejercicio 3: Generador de Rutinas de Ejercicio
Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
duraciones*/
public class ejercicio3 {
    public static void main(String[] args) {
        int condicion_fisica;
        int tipo_rutina1;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su condición física para conocer las diferentes rutinas:\n1.PRINCIPIANTE\n2.INTERMEDIO\n3.AVANZADO");
        condicion_fisica = lectura.nextInt();
        switch (condicion_fisica) {
            case 1:
                System.out.println("PRINCIPIANTE\n1.RUTINA CUERPO COMPLETO\n2.RUTINA FUERZA Y TONIFICACIÓN\n3.RUTINA DE CIRCUITO");
                tipo_rutina1 = lectura.nextInt();
                switch (tipo_rutina1) {
                    case 1:
                        System.out.println("RUTINA CUERPO COMPLETO:\nCALENTAMIENTO: Caminadora 10mins\nSentadillas 3x10\nPress banca 3x10\nPeso muerto 3x10\nDominadas asistidas AL FALLO\nPlancha 30-60segs");
                        System.out.println("Frecuencia: 2 a 3 veces por semana");
                        System.out.println("Nota: Tomar descansos de 30 a 50 segundos entre series");
                        break;
                    case 2:
                        System.out.println("RUTINA FUERZA Y TONIFICACIÓN:\nCALENTAMIENTO: CAMINADORA 15mins\nPrensa de piernas 3x10\nPress militar 3x8\nRemo 3x10\nFlexiones de brazo 3x8a12\nAbdominales 3x8a12\nCardio 15-20 minutos");
                        System.out.println("Frecuencia: 2 a 3 veces por semana");
                        System.out.println("Nota: Descansos entre 30 a 50 segundos entre series");
                        break;
                    case 3:
                        System.out.println("RUTINA DE CIRCUITO:\nCALENTAMIENTO: SALTOS 5mins\nSentadillas 10reps\nFlexiones de brazos 8reps\nPuente 10 reps\nMountain Climbers 30segs\nElevación de talones 12reps\nAbdominales 10reps\nCardio 5mins");
                        System.out.println("Repetir la rutina 3 veces");
                        System.out.println("Frecuencia: 2 a 3 veces por semana");
                        System.out.println("Nota: Descansos de 4-5 minutos entre repeticiones de rutina");
                        break;
                }
                break;
            case 2:
                System.out.println("INTERMEDIO:\n1.RUTINA DE FUERZA\n2.RUTINA FULL BODY");
                tipo_rutina1 = lectura.nextInt();
                switch (tipo_rutina1) {
                    case 1:
                        System.out.println("RUTINA DE FUERZA:\nCALENTAMIENTO:15 mins\nPress banca 3x6\nPrensa 3x6\nPolea cruzada 3x6\nMaquina cuadriceps 3x6\nPress militar 3x6\nFINAL: BICICLETA 5mins");
                        System.out.println("Frecuencia 4 veces por semana");
                        System.out.println("Nota: Mucho peso pocas repeticiones, descansos largos");
                        break;
                    case 2:
                        System.out.println("RUTINA FULL BODY:\nCALENTAMIENTO:15 mins\nPress banca 3x12\nPrensa 3x12\nPolea cruzada 3x12\nMaquina cuadriceps 3x12\nPress militar 3x12\nCamilla posterior 3x12\nDominadas AL FALLO\nSentadillas 3x12\nBicicleta 5mins");
                        System.out.println("Frecuencia 4 veces por semana");
                        System.out.println("Nota: Descansos cortos muchas repeticiones");
                        break;
                }
                break;
            case 3:
                System.out.println("AVANZADO:\n1.RUTINA DE FUERZA\n2.RUTINA HIPERTROFIA");
                tipo_rutina1 = lectura.nextInt();
                switch (tipo_rutina1) {
                    case 1:
                        System.out.println("RUTINA DE FUERZA\nCALENTAMIENTO: Soga 10mins\nPress banca 3x6-8\nPress militar 3x6-8\nPrensa 3x6-8\nCamilla cuadriceps 3x6-8\nCamilla posterior 3x6-8\nSentadillas 3x6-8\nCardio 20mins");
                        System.out.println("Frecuenia 5 veces por semana");
                        System.out.println("Nota: Mucho peso porcas repeticiones, descansos largos");
                        break;
                    case 2:
                        System.out.println("RUTINA HIPERTROFIA\nCALENTAMIENTO: Soga 10mins\nPress banca 3x12\nPress militar 3x12\nPrensa 3x12\nCamilla cuadriceps 3x12\nCamilla posterior 3x12\nSentadillas 3x12\nCardio 20mins");
                        System.out.println("Frecuencia 5 veces por semana");
                        System.out.println("Nota: Poco peso muchas repeticiones para la hipertrofia");
                        break;
                }
                break;
        }
    }
}
