package POO.Repaso2Rigoni;

public class main {
    public static void main(String[] args) {
        Supermercado Jumbo = new Supermercado();
        Jumbo.agregarProducto(new Producto("Pan",10.00,100));
        Jumbo.agregarProducto(new Producto("Leche",20.00,2));
        Jumbo.agregarProducto(new Producto("Cacao",15.00,1));

        Cliente kiki = new Cliente("Kiki","Rivas");

        Jumbo.realizarCompra(kiki,"Pan");
        Jumbo.realizarCompra(kiki,"Cacao");
        Jumbo.realizarCompra(kiki,"Cacao");
        Jumbo.realizarCompra(kiki,"Galletas");

        kiki.calcularTotal();


    }
}
