package TODOCODE;

import java.util.ArrayList;
import java.util.List;

public class Arraylists {
    public static void main(String[] args) {
        /*List<Persona> lista = new ArrayList();

        lista.add(new Persona(1,"Martiniano",20));
        lista.add(new Persona(2,"Maria Elena", 56));
        lista.add(new Persona(3,"Guillermo",56));
        lista.add(new Persona(4,"Paula",27));

        for (Persona perso:lista){
            if (perso.getNombre().length()>8){
                System.out.println("LENGHT= " + perso.getNombre().length());
            } else {
                System.out.println("MAYOR A 8");
            }
        }*/

        List<nOTAS> notas = new ArrayList<>();

        notas.add(new nOTAS(1,7.00));
        notas.add(new nOTAS(2,5.00));
        notas.add(new nOTAS(3,8.50));
        notas.add(new nOTAS(4,9.25));

        for (nOTAS mejorNota:notas){
            if (mejorNota.getValor() >= 7.00) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Desaprobado");
            }
        }

    }

}
