public class ejercicio4FUNCIONEYSBUCLES {

    public static void main(String[] args) {

        String[] clientes = {"Cliente 1", "Cliente 2", "Cliente 3", "Cliente 4", "Cliente 5"};
        int[] compras = {5, 12, 8, 15, 3};


        calcularDescuentos(clientes, compras);
    }


    public static void calcularDescuentos(String[] clientes, int[] compras) {
        for (int i = 0; i < clientes.length; i++) {
            double descuento;
            if (compras[i] > 10) {
                descuento = 0.10;
            } else {
                descuento = 0.0;
            }

            System.out.printf("%s: %.0f%% de descuento%n", clientes[i], descuento * 100);
        }
    }
}