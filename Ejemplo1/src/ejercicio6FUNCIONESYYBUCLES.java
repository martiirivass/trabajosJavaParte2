public class ejercicio6FUNCIONESYBUCLES {

    public static void main(String[] args) {

        double[] facturas = {100.0, 250.5, 75.75, 400.0, 150.25};


        double[] impuestos = calcularImpuesto(facturas);

        for (int i = 0; i < facturas.length; i++) {
            System.out.printf("Factura: %.2f - Impuesto: %.2f%n", facturas[i], impuestos[i]);
        }
    }

    public static double[] calcularImpuesto(double[] facturas) {
        double[] impuestos = new double[facturas.length];
        double tasaImpuesto = 0.21;


        for (int i = 0; i < facturas.length; i++) {
            impuestos[i] = facturas[i] * tasaImpuesto;
        }

        return impuestos;
    }
}
