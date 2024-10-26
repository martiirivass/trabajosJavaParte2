public class ejercicio7FUNCIONESYBUCLES {

    public static void main(String[] args) {

        double[] compras = {455.0, 700.0, 230.00, 700.0, 400.00};


        double[] descuentosAplicados = aplicarDescuento(compras);


        for (int i = 0; i < compras.length; i++) {
            System.out.printf("Compra original: %.2f - Total con descuento: %.2f%n", compras[i], descuentosAplicados[i]);
        }
    }


    public static double[] aplicarDescuento(double[] compras) {
        double[] totalesConDescuento = new double[compras.length];
        double tasaDescuento = 0.15;

        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                totalesConDescuento[i] = compras[i] * (1 - tasaDescuento);
            } else {
                totalesConDescuento[i] = compras[i];
            }
        }

        return totalesConDescuento;
    }
}