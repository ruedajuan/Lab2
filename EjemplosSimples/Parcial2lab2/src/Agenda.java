import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda implements Serializable {
    private List<Contacto> listaContactos=new ArrayList<Contacto>();
    Scanner nuevaEntrada=new Scanner(System.in);

    public void agregarContactos(Contacto contacto){
        listaContactos.add(contacto);
    }
    public void listar(){
        int aux=0;
        String listado = '\n' + "Listado de personas: " + '\n';
        for(Contacto c:listaContactos){
            System.out.println(c.toString());
            aux++;
        }
        System.out.println("N° de contactos: "+ aux);
    }
    public void buscarPorNombre(String nombreOApellido){
        int aux=0;
        for(int i=0;i<listaContactos.size();i++){
            if (listaContactos.get(i).getApellido().equals(nombreOApellido)){
                System.out.println(listaContactos.get(i).getApellido());
                System.out.println(listaContactos.get(i).getNombre());
                aux=1;
            }
            else if (listaContactos.get(i).getNombre().equals(nombreOApellido)){
                System.out.println(listaContactos.get(i).getApellido());
                System.out.println(listaContactos.get(i).getNombre());
                aux=1;
            }
        }
        if (aux!=1){
            System.out.println("NO EXISTEN CONTACTOS QUE COINCIDAN CON EL CRITERIO");
        }

    }
    public void buscarPorDni(int dni){
        int aux=-1;

        for(int i=0;i<listaContactos.size();i++){
            if (listaContactos.get(i).getDni()==dni){
                System.out.println(listaContactos.get(i).getApellido());
                System.out.println(listaContactos.get(i).getNombre());
                System.out.println(listaContactos.get(i).getDni());
                aux=1;
            }
        }
        if(aux<0) {
            System.out.println("NO EXISTEN CONTACTOS CON DNI "+ dni);
        }
    }
    public void eliminarPorDni(int dni){
        int aux=-1;
        for(int i=0;i<listaContactos.size();i++){
            if (listaContactos.get(i).getDni()==dni){
                listaContactos.remove(i);
                aux=1;
            }
        }
        if(aux<0){
            System.out.println("NO EXISTEN CONTACTOS CON El DNI "+ dni);
        }
    }
    public void editarContacto(int dni){
        int aux=-1;
        for(int i=0;i<listaContactos.size();i++){
            if (listaContactos.get(i).getDni()==dni){
                System.out.println("Ingrese el nuevo nombre: ");
                listaContactos.get(i).setNombre(nuevaEntrada.next());
                System.out.println("Ingrese el nuevo apellido");
                listaContactos.get(i).setApellido(nuevaEntrada.next());
                System.out.println("Ingrese el nuevo telefono");
                listaContactos.get(i).setTelefono(nuevaEntrada.next());
                System.out.println("Ingrese el nuevo email");
                listaContactos.get(i).setEmail(nuevaEntrada.next());
                aux=1;
            }
        }
        if(aux<0){
            System.out.println("NO EXISTEN CONTACTOS CON El DNI "+ dni);
        }
    }



}
