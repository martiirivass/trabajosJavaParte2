/*Ejercicio 3: Gestión de clientes
Una pequeña empresa de servicios tiene una lista de clientes a los que debe enviar facturas, pero quiere procesar solo aquellos que tengan facturas pendientes por más de $500.

**Instrucciones**:
- Crea un arreglo `clientes` que almacene los nombres de los clientes y un arreglo `facturasPendientes` con el monto de sus facturas pendientes.
- Escribe una función `enviarFacturas` que imprima los nombres de los clientes con facturas mayores a $500.
*/
public class ejercicio3FUNCIONESYBUCLES {
    public static void main(String[] args) {
        String[] clientes={"Pedro","Alonso","Ramón","Juan","Martin","Claudio"};
        double[] facturasPendientes={300.00,550.00,325.00,499.00,500.00,860.00};
        enviarFacturas(clientes,facturasPendientes);
    }

    //FUNCION
    public static void enviarFacturas(String[]clientes,double[]facturasPendientes){
        System.out.println("CLIENTES CON FACTURAS PENDIENTES MAYORES A %500");

        if (clientes.length != facturasPendientes.length){
            System.out.println("ERROR: Los arreglos de clientes y facturas deben tener la misma longitud");
            return;
        }
        for (int i=0; i< facturasPendientes.length;i++){
            if (facturasPendientes[i]>500){
                System.out.println(clientes[i]);
            }
        }

    }
}