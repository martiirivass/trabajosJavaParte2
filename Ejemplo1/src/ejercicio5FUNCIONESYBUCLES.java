public class ejercicio5FUNCIONESYBUCLES {

    public static void main(String[] args) {

        int[] calificaciones = {5, 4, 3, 4, 5, 2, 1, 4, 3, 5};


        double promedio = calcularPromedioSatisfaccion(calificaciones);


        System.out.printf("El promedio de satisfacción del cliente es: %.2f%n", promedio);
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        double suma = 0;


        for (int calificacion : calificaciones) {
            suma += calificacion;
        }


        return suma / calificaciones.length;
    }
}
