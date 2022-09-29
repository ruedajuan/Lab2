public class Estudiante extends Persona implements Comparable<Estudiante>{
    public Estudiante(String nombre,String apellido,int legajo){
        super(nombre,apellido,legajo);

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Estudiante o) {
        int salida;
        if(o.getApellido().compareToIgnoreCase(this.getApellido())==0){
            if(o.getNombre().compareToIgnoreCase(this.getNombre())>0){
                salida=-1;
            }else if (o.getNombre().compareToIgnoreCase(this.getNombre())<0){
                salida=1;
            }else salida=0;

        }else if (o.getApellido().compareToIgnoreCase(this.getApellido())>0){
            salida=-1;
        }else salida=1;
        return salida;
    }
}
