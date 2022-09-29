import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Carrera implements Informacion,Comparable<Carrera> {
    private String nombre;
    private List<Materia> coleccionMaterias= new ArrayList<Materia>() ;

    public Carrera(){

    }
    public Carrera(String nombre, List<Materia> coleccionMaterias) {
        this.nombre = nombre;
        this.coleccionMaterias=coleccionMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColeccionMaterias(List<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }
    public List<Materia> getColeccionMaterias(){
        return coleccionMaterias;
    }

    public void agregarMateria(Materia materia){
        coleccionMaterias.add(materia);
    }
    public void eliminarMateria(String materiaABorrar){
        for(int i=0;i<coleccionMaterias.size();i++){
            if(coleccionMaterias.get(i).getNombre().equals(materiaABorrar)){
                coleccionMaterias.remove(i);
            }
        }

    }
    public void encontrarMateria(String materiaAEncontrar){
          for(int i=0;i<coleccionMaterias.size();i++){
                if(coleccionMaterias.get(i).getNombre().equals(materiaAEncontrar)){
                    System.out.println("Materia encontrada");
                    System.out.println("¿Desea eliminarla? En caso afirmativo presione 1 ");
                    Scanner s1 = new Scanner(System.in);
                    int aux = s1.nextInt();
                    if (aux==1)  coleccionMaterias.remove(i);
                }
            }

        }


    @Override
    public int verCantidad() {
        int x =coleccionMaterias.size();
        System.out.println("Materias en "+ getNombre()+": " +x);
        return x;
    }

    @Override
    public String listarContenidos() {
        Collections.sort(coleccionMaterias);
        for (Materia est:coleccionMaterias){
            System.out.println(est.toString());
        }

        return null;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", coleccionMaterias=" + coleccionMaterias +
                '}';
    }

    @Override
    public int compareTo(Carrera o) {
        int salida;
        if(o.getNombre().compareToIgnoreCase(this.getNombre())==0){
            salida=0;
        }else if (o.getNombre().compareToIgnoreCase(this.getNombre())>0){
            salida=-1;
        }else salida=1;
        return salida;
    }
}
