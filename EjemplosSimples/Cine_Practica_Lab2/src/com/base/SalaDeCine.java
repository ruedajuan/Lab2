package com.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SalaDeCine implements Informacion {
    private String nombreSala;
    private String peliculaProyectada;
    private int capacidad;
    private List<Espectadores> listaEspectadores = new ArrayList<Espectadores>();
    private Iterator<Espectadores> iterador = listaEspectadores.iterator();

    public SalaDeCine(String nombreSala, String peliculaProyectada,int capacidad){
        this.capacidad=capacidad;
        this.nombreSala=nombreSala;
        this.peliculaProyectada=peliculaProyectada;
    }



    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public String getPeliculaProyectada() {
        return peliculaProyectada;
    }

    public void setPeliculaProyectada(String peliculaProyectada) {
        this.peliculaProyectada = peliculaProyectada;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    //Agregando espectadores de a uno
    public void agregarEspectadores(Espectadores espectador){
        if (listaEspectadores.size()<=capacidad){
            listaEspectadores.add(espectador);
        }
        else System.out.println("La sala esta completa");
    }
    //Agregando una lista de espectadores
    public void agregarListaEspectadores(List<Espectadores> listita){
        if (listita.size()<=capacidad){
            listaEspectadores=listita;
        }
        else System.out.println("La lista supera la capacidad de la sala");
    }

    //Eliminar un espectador por su nombre
    public void eliminarEspectador(String nombreEliminar){
        iterador=listaEspectadores.iterator();
        while (iterador.hasNext()){
            String buscador=iterador.next().getNombre();
            if(buscador.equals(nombreEliminar)){
                iterador.remove();
            }
        }
    }

    @Override
    public String getName() {
        System.out.println(getNombreSala());
        return null;
    }

    @Override
    public String toString() {
        return "SalaDeCine{" +
                "nombreSala='" + nombreSala + '\'' +
                ", peliculaProyectada='" + peliculaProyectada + '\'' +
                ", capacidad=" + capacidad +
                ", listaEspectadores=" + listaEspectadores +
                '}';
    }
}
