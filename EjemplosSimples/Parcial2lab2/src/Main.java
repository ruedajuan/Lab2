import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Agenda a1 = new Agenda();

        int opcion=-1;
        Scanner entrada = new Scanner(System.in);
        try {


            while (opcion != 99) {
                System.out.println(
                        "\n ---------------------- \n" +
                                "1. Nuevo Contacto\n" +
                                "2. Listar todos los contactos\n" +
                                "3. Buscar contacto por nombre o apellido\n" +
                                "4. Buscar Contacto por DNI\n" +
                                "5. Eliminar Contacto por DNI\n" +
                                "6. imprimir en un archivo\n" +
                                "7. editar contacto\n" +
                                "99. salir\n" +
                                "Ingrese una opcion:"
                );
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        try {
                            System.out.println("Ingrese el nombre");
                            String nombre = entrada.next();
                            System.out.println("Ingrese el apellido");
                            String apellido = entrada.next();
                            System.out.println("Ingrese dni");
                            int dni = entrada.nextInt();
                            System.out.println("Ingrese telefono");
                            String telefono = entrada.next();
                            System.out.println("Ingrese Email");
                            String email = entrada.next();
                            Contacto contacto = new Contacto(nombre, apellido, dni, telefono, email);
                            a1.agregarContactos(contacto);
                            break;
                        } catch (Exception e) {
                            System.out.println("Error en el ingreso de datos");
                            break;
                        }

                    case 2:
                        a1.listar();
                        break;
                    case 3:
                        System.out.println("Ingrese el nombre o apellido del contacto que quiere buscar");
                        String buscador = entrada.next();
                        a1.buscarPorNombre(buscador);
                        break;
                    case 4:
                        System.out.println("Ingrese el dni del contacto que quiere buscar");
                        int dnib = entrada.nextInt();
                        a1.buscarPorDni(dnib);
                        break;
                    case 5:
                        System.out.println("Ingrese el dni del Contacto que quiere eliminar");
                        int dnie = entrada.nextInt();
                        a1.eliminarPorDni(dnie);
                    case 6:
                        break;
                    case 7:
                        System.out.println("Ingrese el dni del Contacto que quiere editar");
                        int dnied = entrada.nextInt();
                        a1.editarContacto(dnied);
                        break;
                    case 99:
                        break;
                    default:
                        System.out.println("OPCION INCORRECTA");
                        break;


                }
            }

        }catch (Exception e){
            System.out.println("Error en el ingreso de datos");
        }
    }
}
