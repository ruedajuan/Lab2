package com.base;

public class Empleado extends Persona implements Informacion{
    private double sueldo;

    public Empleado(String nombre,String dni, double sueldo){
        super(nombre,dni);
        this.sueldo=sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getName() {
        System.out.println(getNombre());
        return null;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre="+super.getNombre()+'\'' +
                "dni="+super.getDni()+'\''+
                "sueldo=" + sueldo +
                '}';
    }
}
