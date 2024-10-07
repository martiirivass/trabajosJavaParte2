import java.util.Scanner;

//Ejercicio 2: Calculadora de Calorías Quemadas
//Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
//minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
//calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
//ejercicio.

public class ejercicio2 {
    public static void main(String[] args) {
        float peso_usuario, duracion_ejercicio;
        int tipo_ejercicio;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Escriba su peso en KG: ");
        peso_usuario=lectura.nextFloat();
        System.out.println("Duración del ejercicio en minutos: ");
        duracion_ejercicio=lectura.nextFloat();
        System.out.println("EJERCICIO REALIZADO:\n1.CORRER\n2.NADAR\n3.BICICLETA\n4.CAMINAR\n5.SALIR");
        tipo_ejercicio=lectura.nextInt();
        switch (tipo_ejercicio) {
            case 1:
                System.out.println("Seleccionaste Correr:\nLa cantidad de calorías quemadas son: "+ (duracion_ejercicio*peso_usuario*0.16)); //Suponiendo que 0.16 es una intensidad moderada
                break;
            case 2:
                System.out.println("Seleccionaste Nadar:\nLa cantidad de calorías quemadas son: "+ (duracion_ejercicio*peso_usuario*0.22));
                break;
            case 3:
                System.out.println("Seleccionaste Bicicleta:\nLa cantidad de calorías quemadas son: "+ (duracion_ejercicio*peso_usuario*0.17));
                break;
            case 4:
                System.out.println("Seleccionaste Caminar:\nLa cantidad de calorías quemadas son: "+ (duracion_ejercicio*peso_usuario*0.12));
                break;
            case 5:
                System.out.println("Saliendo del programa.");
                break;
        }
    }
}
