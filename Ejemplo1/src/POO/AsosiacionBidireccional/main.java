package POO.AsosiacionBidireccional;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Martiniano");
        Persona p2 = new Persona("Brisa");

        Libro l1 = new Libro("Libro1");
        Libro l2 = new Libro("Libro2");
        Libro l3 = new Libro("Libro3");
        Libro l4 = new Libro("Libro4");

        p1.agregarLibros(l1);
        p2.agregarLibros(l1);
        p1.agregarLibros(l2);
        p1.agregarLibros(l3);
        p2.agregarLibros(l4);

        p1.mostrarLibros();
        System.out.println("-------------------");
        p2.mostrarLibros();
    }
}
