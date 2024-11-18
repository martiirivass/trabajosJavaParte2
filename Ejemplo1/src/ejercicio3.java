import java.util.ArrayList;
import java.util.List;

// Clase abstracta CanalNotificacion
abstract class CanalNotificacion {
    protected String usuario;
    protected String mensaje;

    public CanalNotificacion(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    public abstract void enviarNotificacion();

    @Override
    public String toString() {
        return "Usuario: " + usuario + ", Mensaje: " + mensaje;
    }
}

// Interfaz Personalizable
interface Personalizable {
    void personalizarMensaje(String nuevoMensaje);
}

// Clase CorreoElectronico
class CorreoElectronico extends CanalNotificacion implements Personalizable {
    private String direccionCorreo;

    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando correo electrónico a " + direccionCorreo + ": " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
    }

    @Override
    public String toString() {
        return super.toString() + ", Dirección de Correo: " + direccionCorreo;
    }
}

// Clase MensajeTexto
class MensajeTexto extends CanalNotificacion implements Personalizable {
    private String numeroTelefono;

    public MensajeTexto(String usuario, String mensaje, String numeroTelefono) {
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando mensaje de texto a " + numeroTelefono + ": " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Teléfono: " + numeroTelefono;
    }
}

// Clase Notificaciones
class Notificaciones {
    private List<CanalNotificacion> canales;

    public Notificaciones() {
        this.canales = new ArrayList<>();
    }

    public void agregarCanal(CanalNotificacion canal) {
        canales.add(canal);
        System.out.println("Canal agregado: " + canal);
    }

    public void enviarNotificaciones() {
        for (CanalNotificacion canal : canales) {
            canal.enviarNotificacion();
        }
    }

    public void personalizarMensajes(String nuevoMensaje) {
        for (CanalNotificacion canal : canales) {
            if (canal instanceof Personalizable) {
                ((Personalizable) canal).personalizarMensaje(nuevoMensaje);
            }
        }
    }

    public void mostrarCanales() {
        System.out.println("Canales de notificación:");
        for (CanalNotificacion canal : canales) {
            System.out.println(canal);
        }
    }
}

// Clase SistemaNotificaciones (main)
public class ejercicio3 {
    public static void main(String[] args) {
        Notificaciones sistemaNotificaciones = new Notificaciones();

        // Crear canales de notificación
        CanalNotificacion correo = new CorreoElectronico("Juan Pérez", "¡Bienvenido a nuestra app!", "juan.perez@example.com");
        CanalNotificacion mensajeTexto = new MensajeTexto("Ana López", "Su pedido ha sido enviado.", "555-1234");

        // Agregar canales al sistema
        sistemaNotificaciones.agregarCanal(correo);
        sistemaNotificaciones.agregarCanal(mensajeTexto);

        // Mostrar canales de notificación
        sistemaNotificaciones.mostrarCanales();

        // Enviar notificaciones
        System.out.println("\nEnviando notificaciones:");
        sistemaNotificaciones.enviarNotificaciones();

        // Personalizar mensajes
        System.out.println("\nPersonalizando mensajes:");
        sistemaNotificaciones.personalizarMensajes("Este es un mensaje personalizado.");

        // Mostrar canales después de personalizar
        sistemaNotificaciones.mostrarCanales();

        // Enviar notificaciones nuevamente
        System.out.println("\nEnviando notificaciones personalizadas:");
        sistemaNotificaciones.enviarNotificaciones();
    }
}

