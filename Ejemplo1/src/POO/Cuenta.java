package POO;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        setTitular(titular);
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        setTitular(titular);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) throws IllegalArgumentException {
        if (this.titular != null) {
            this.titular=titular;
        } else {
            throw new IllegalArgumentException("No puede haber un nombre de titular vacío");
        }
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public double ingresar(double cantidad){
        if (cantidad < 0) {
            System.out.println("No se puede ingresar esa cantidad");
        } else {
            this.cantidad += cantidad;
        }
        return this.cantidad;
    }

    public void retirar(double cantidad) {
        if (this.cantidad < cantidad){
            System.out.println("Saldo insuficiente");
        } else {
            this.cantidad -= cantidad;
            System.out.println("Retiro con éxito\nSaldo restante: " + this.cantidad);
        }
    }
}
