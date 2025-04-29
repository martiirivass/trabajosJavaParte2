package POO.Repaso2Rigoni;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre, apellido;
    private List<Producto> carrito = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, List<Producto> carrito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrito = carrito;
    }

    //sobrecarga de constructor sin un carrito
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }

    public void agregarProducto(Producto producto) {
        if (producto.getCantidad() > 0) {
            carrito.add(producto);
            System.out.println("Producto agregado con éxito");
        } else System.out.println("No hay esa cantidad de stock");
    }
    public void calcularTotal(){
        double totalGastado=0;
        for (Producto producto : carrito){
            totalGastado+=producto.getPrecio();
        }
        System.out.println("Total gastado : $"+totalGastado);
    }
}

