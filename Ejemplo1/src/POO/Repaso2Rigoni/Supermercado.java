package POO.Repaso2Rigoni;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    List<Producto> inventario = new ArrayList<>();


    public List<Producto> getInventario() {
        return inventario;
    }

    public void setInventario(List<Producto> inventario) {
        this.inventario = inventario;
    }

    public void agregarProducto(Producto producto) {
        if (producto.getCantidad() > 0) {
            inventario.add(producto);
            System.out.println("Agregado al inventario");
        } else System.out.println("Stock no disponible");
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void realizarCompra(Cliente cliente, String nombreProducto) {
        Producto productoAComprar = null;
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                productoAComprar = producto;
                break;
            }
        }
        if (productoAComprar!=null) {
            if (productoAComprar.getCantidad() > 0) {
                cliente.agregarProducto(new Producto(productoAComprar.getNombre(), productoAComprar.getPrecio(), 1));
                productoAComprar.restarCantidad(1);

                if (productoAComprar.getCantidad() == 0) {
                    inventario.remove(productoAComprar);
                }

                System.out.println("Compra realizada: " + nombreProducto);
            } else {
                System.out.println("Producto sin stock " + nombreProducto);
            }
        } else {
            System.out.println("Producto no disponible: " + nombreProducto);
        }
    }
}

