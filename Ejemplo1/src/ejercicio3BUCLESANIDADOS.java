import java.util.Scanner;
public class ejercicio3BUCLESANIDADOS {

    public static void main(String[] args) {
        int N;
        double factorial, suma = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un número > 0: ");
            N = sc.nextInt();
        } while (N < 0);

        for (int i = 0; i <= N; i++) {


            factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }


            System.out.printf("%n%2d! = %.0f %n", i, factorial);


            suma = suma + factorial;
        }


        System.out.printf("Suma de los factoriales desde 0 hasta %d: %.0f%n", N, suma);
    }
}

