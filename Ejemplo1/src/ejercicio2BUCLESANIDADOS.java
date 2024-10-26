import java.util.Scanner;

public class ejercicio2BUCLESANIDADOS {
    public static void main(String[] args) {
        int num;
        double factorial;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese un número para saber su factorial");
        num= lectura.nextInt();

        for (int i=1; i<=num; i++) {
            factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;

            }
            System.out.printf("%2d! = %.0f %n", i, factorial);
        }
    }
}
