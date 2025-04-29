package POO.Practico4.Kata1;

public class main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Martiniano","Empleado",1,1000000.0);
        Empleado e2 = new Empleado("Guillermo","Jefe");

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println("--------------");
        e2.actualizarSalario(25000.00);
        e1.actualizarSalario(15);
        System.out.println("--------------");
        System.out.println("El salario de " + e1.getNombre() + " es de: $" + e1.getSalario());
        System.out.println("El salario de " + e2.getNombre() + " es de: $" + e2.getSalario());
    }
}
