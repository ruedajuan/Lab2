import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        //Facultad
        Facultad unne = new Facultad();
        unne.setNombre("UNNE");
        Facultad utn = new Facultad();
        utn.setNombre("UTN-FRRE");

        //Carrera
        Carrera tup = new Carrera();
        tup.setNombre("tup");
        Carrera arquitectura = new Carrera();
        arquitectura.setNombre("arquitectura");
        Carrera electromecanica = new Carrera();
        electromecanica.setNombre("electromecanica");

        //Agregar carreras a la Facultad

        unne.agregarCarrera(arquitectura);
        unne.agregarCarrera(electromecanica);
        utn.agregarCarrera(tup);
        utn.agregarCarrera(electromecanica);
        utn.agregarCarrera(arquitectura);
        utn.verCantidad();

        utn.eliminarCarrera("arquitectura");
        utn.verCantidad();


        // Materias
        Materia laboratorio= new Materia();
        laboratorio.setNombre("laboratorio");
        Materia programacion=new Materia();
        programacion.setNombre("programacion");
        Materia diseño = new Materia();
        diseño.setNombre("diseño");
        Materia matematica= new Materia();
        matematica.setNombre("matematica");
        Materia ingles = new Materia();
        ingles.setNombre("ingles");

        //Agregar materias a una carrera
        tup.agregarMateria(laboratorio);
        tup.agregarMateria(programacion);
        tup.agregarMateria(matematica);
        tup.agregarMateria(ingles);
        tup.agregarMateria(diseño);

        tup.verCantidad();
        //elimino una materia
        tup.eliminarMateria("diseño");
        tup.verCantidad(); //verifico que se haya borrado
        //tup.encontrarMateria("programacion");
        //tup.verCantidad();



        //Estudiantes
        Estudiante e1 = new Estudiante("Jose","Pekerman",222);
        Estudiante e2 = new Estudiante("Pepe","Argento",223);
        Estudiante e3 = new Estudiante("Homero","Simpson",224);
        Estudiante e4 = new Estudiante("Bruno","Diaz", 225);
        Estudiante e5 = new Estudiante("Francia","Doggy",226);
        Estudiante e6 = new Estudiante("Fernando","Carlos",227);

        //Agrego estudiantes a la materia

        laboratorio.agregarEstudiante(e1);
        laboratorio.agregarEstudiante(e2);
        laboratorio.agregarEstudiante(e3);
        laboratorio.agregarEstudiante(e4);
        laboratorio.agregarEstudiante(e5);
        laboratorio.agregarEstudiante(e6);
        laboratorio.verCantidad();
        laboratorio.eliminarEstudiante("Pekerman");
        laboratorio.verCantidad();
        programacion.agregarEstudiante(e2);
        programacion.agregarEstudiante(e4);

        //eliminar estudiante de facultad
        utn.eliminarEstudiante(e4);
        laboratorio.verCantidad();
        programacion.verCantidad();

        //Agrego profe a una materia
        Profesor p1 = new Profesor("Bill","Gates",1,10000,40);
        laboratorio.setTitular(p1);
        p1.calcularSueldo(p1.getBasico(), p1.getAntiguedad());


        utn.listarContenidos();
        tup.listarContenidos();
        laboratorio.listarContenidos();



    }

}
