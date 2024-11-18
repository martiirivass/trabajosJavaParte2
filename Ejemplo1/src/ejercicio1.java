import java.util.ArrayList;
import java.util.List;

// Clase abstracta Vuelo
abstract class Vuelo {
    protected String numeroVuelo;
    protected String origen;
    protected String destino;
    protected String fecha;

    public Vuelo(String numeroVuelo, String origen, String destino, String fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public abstract double calcularPrecio();

    @Override
    public String toString() {
        return "Vuelo " + numeroVuelo + " [" + origen + " -> " + destino + "] Fecha: " + fecha;
    }
}

// Interfaz Promocionable
interface Promocionable {
    void aplicarPromocion(double descuento);
}

// Clase VueloRegular
class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private double precioBasePorAsiento;

    public VueloRegular(String numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBasePorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioBasePorAsiento;
    }

    @Override
    public void aplicarPromocion(double descuento) {
        precioBasePorAsiento -= precioBasePorAsiento * (descuento / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " (Regular) Precio total: " + calcularPrecio();
    }
}

// Clase VueloCharter
class VueloCharter extends Vuelo implements Promocionable {
    private double precioTotal;

    public VueloCharter(String numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion(double descuento) {
        precioTotal -= precioTotal * (descuento / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " (Charter) Precio total: " + calcularPrecio();
    }
}

// Clase Reservas
class Reservas {
    private List<Vuelo> vuelos;

    public Reservas() {
        vuelos = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularPrecioTotal() {
        return vuelos.stream().mapToDouble(Vuelo::calcularPrecio).sum();
    }

    public void aplicarPromociones(double descuento) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion(descuento);
            }
        }
    }

    public void mostrarVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo);
        }
    }
}

// Clase SistemaReservas (main)
public class ejercicio1 {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        // Crear vuelos regulares y charter
        VueloRegular vuelo1 = new VueloRegular("VR001", "Lima", "Buenos Aires", "2024-12-01", 150, 100.0);
        VueloRegular vuelo2 = new VueloRegular("VR002", "Madrid", "París", "2024-12-05", 200, 80.0);
        VueloCharter vuelo3 = new VueloCharter("VC001", "New York", "Las Vegas", "2024-12-10", 5000.0);

        // Agregar vuelos a las reservas
        reservas.agregarVuelo(vuelo1);
        reservas.agregarVuelo(vuelo2);
        reservas.agregarVuelo(vuelo3);

        // Mostrar vuelos
        System.out.println("Vuelos antes de aplicar promociones:");
        reservas.mostrarVuelos();

        // Aplicar promociones
        reservas.aplicarPromociones(10); // Aplicar un 10% de descuento

        // Mostrar vuelos después de la promoción
        System.out.println("\nVuelos después de aplicar promociones:");
        reservas.mostrarVuelos();

        // Calcular precio total
        System.out.println("\nPrecio total de todas las reservas: " + reservas.calcularPrecioTotal());
    }
}

