package com.base;

public class Espectadores extends Persona implements Informacion{
    private String fila;
    private int silla;

    public Espectadores(String nombre, String dni,int silla,String fila){
        super(nombre,dni);
        this.fila=fila;
        this.silla=silla;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    @Override
    public String getName() {
        System.out.println(getNombre());
        return null;
    }

    @Override
    public String toString() {
        return "Espectadores{" +
                "nombre="+super.getNombre()+'\'' +
                "dni="+super.getDni()+'\''+
                "fila='" + fila + '\'' +
                ", silla=" + silla +
                '}';
    }
}
