//Mostrar los numeros perfectos entre 1 y 1000

public class ejercicio1BUCLESANIDADOS {
    public static void main(String[] args) {
        int num, divisor, suma;
        System.out.println("Números perfectos entre 1 y 1000: ");
        for(num=1;num <= 1000;num++){
            suma = 0;
            for(divisor = 1;divisor < num;divisor++){
                if(num % divisor==0){
                    suma = suma + divisor;
                }
            }
            if(num == suma){
                System.out.println(num);
            }
        }
    }
}
