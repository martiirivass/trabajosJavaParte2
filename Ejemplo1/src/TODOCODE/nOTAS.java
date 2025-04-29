package TODOCODE;

import java.util.Date;

public class nOTAS {
    private int id;
    private double valor;


    public nOTAS() {
    }

    public nOTAS(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
