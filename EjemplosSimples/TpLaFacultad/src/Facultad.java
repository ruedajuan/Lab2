import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Facultad implements Informacion{
    private String nombre;
    private List<Carrera>coleccionCarreras=new ArrayList<Carrera>() ;

    public Facultad(){
    }

    public Facultad(String nombre,List<Carrera> coleccionCarreras) {
        this.nombre=nombre;
        this.coleccionCarreras=coleccionCarreras;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColeccionCarreras(List<Carrera> coleccionCarreras){
        this.coleccionCarreras=coleccionCarreras;
    }
    public List getColeccionCarreras(){
        return coleccionCarreras;
    }

    void agregarCarrera(Carrera carrera){
        coleccionCarreras.add(carrera);
    }
    void eliminarCarrera(String carreraABorrar){
      for(int i=0;i<coleccionCarreras.size();i++){
          if(coleccionCarreras.get(i).getNombre().equals(carreraABorrar)){
              coleccionCarreras.remove(i);
          }
      }
    }

    void eliminarEstudiante(Estudiante estudiante){

        for(int i=0;i<coleccionCarreras.size();i++){
            for(int j=0;j<coleccionCarreras.get(i).getColeccionMaterias().size();j++){
                for(int k=0;k<coleccionCarreras.get(i).getColeccionMaterias().get(j).getColeccionEstudiantes().size();k++){
                    if(coleccionCarreras.get(i).getColeccionMaterias().get(j).getColeccionEstudiantes().get(k).equals(estudiante)){
                        coleccionCarreras.get(i).getColeccionMaterias().get(j).eliminarEstudiante(estudiante.getApellido());
                    }
                }
            }
        }
    }


    @Override
    public int verCantidad() {
        int x =coleccionCarreras.size();
        System.out.println("Carreras en "+ getNombre()+": "+x);
        return x;
    }





    @Override
    public String listarContenidos() {
        Collections.sort(coleccionCarreras);
        for (Carrera est:coleccionCarreras){
            System.out.println(est.toString());
        }

        return null;
    }
    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", coleccionCarreras=" + coleccionCarreras +
                '}';
    }
}
