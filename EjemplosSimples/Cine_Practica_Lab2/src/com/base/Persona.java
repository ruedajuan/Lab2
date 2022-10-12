package com.base;

public abstract class Persona {
    private String nombre;
    private String dni;

    protected Persona(String nombre,String dni){
        this.dni=dni;
        this.nombre=nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
