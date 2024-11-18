import java.util.ArrayList;
import java.util.List;

// Clase abstracta MetodoPago
abstract class MetodoPago {
    protected String titular;
    protected String numero;

    public MetodoPago(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public abstract void realizarPago(double monto);
    public abstract String cancelarPago();

    @Override
    public String toString() {
        return "Titular: " + titular + ", Número: " + numero;
    }
}

// Interfaz Cancelable
interface Cancelable {
    String cancelarPago();
}

// Clase TarjetaCredito
class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private String codigoSeguridad;

    public TarjetaCredito(String titular, String numero, String fechaExpiracion, String codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con tarjeta de crédito (" + numero + ").");
    }

    @Override
    public String cancelarPago() {
        return "El pago con tarjeta de crédito (" + numero + ") ha sido cancelado.";
    }

    @Override
    public String toString() {
        return super.toString() + ", Fecha Expiración: " + fechaExpiracion;
    }
}

// Clase PayPal
class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con PayPal (correo: " + correoElectronico + ").");
    }

    @Override
    public String cancelarPago() {
        return "El pago con PayPal (correo: " + correoElectronico + ") ha sido cancelado.";
    }

    @Override
    public String toString() {
        return super.toString() + ", Correo Electrónico: " + correoElectronico;
    }
}

// Clase Pagos
class Pagos {
    private List<MetodoPago> metodosPago;

    public Pagos() {
        this.metodosPago = new ArrayList<>();
    }

    public void agregarMetodoPago(MetodoPago metodoPago) {
        metodosPago.add(metodoPago);
        System.out.println("Método de pago agregado: " + metodoPago);
    }

    public void realizarPagos(double monto) {
        for (MetodoPago metodo : metodosPago) {
            metodo.realizarPago(monto);
        }
    }

    public void cancelarPagos() {
        for (MetodoPago metodo : metodosPago) {
            if (metodo instanceof Cancelable) {
                System.out.println(((Cancelable) metodo).cancelarPago());
            }
        }
    }

    public void mostrarMetodosPago() {
        System.out.println("Métodos de pago registrados:");
        for (MetodoPago metodo : metodosPago) {
            System.out.println(metodo);
        }
    }
}

// Clase SistemaDePagos (main)
public class ejercicio2 {
    public static void main(String[] args) {
        Pagos sistemaPagos = new Pagos();

        // Crear métodos de pago
        MetodoPago tarjeta = new TarjetaCredito("Juan Pérez", "1234-5678-9012-3456", "12/25", "123");
        MetodoPago paypal = new PayPal("Ana López", "N/A", "ana.lopez@example.com");

        // Agregar métodos de pago al sistema
        sistemaPagos.agregarMetodoPago(tarjeta);
        sistemaPagos.agregarMetodoPago(paypal);

        // Mostrar métodos de pago
        sistemaPagos.mostrarMetodosPago();

        // Realizar pagos
        System.out.println("\nRealizando pagos:");
        sistemaPagos.realizarPagos(250.0);

        // Cancelar pagos
        System.out.println("\nCancelando pagos:");
        sistemaPagos.cancelarPagos();
    }
}

