import java.util.Scanner;

public class PesoPersona {

    public static void main(String[] args) {
	// Peso ideal

        int x1,altura,peso;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su altura en cm");
        altura= s.nextInt();
        if (altura>120) {
            System.out.println("Ingrese su genero, escriba 1 si es hombre o 2 si es mujer ");
            x1= s.nextInt();

            switch (x1) {
                case 1:
                    peso = altura - 110;
                    System.out.println("Su peso ideal es " + peso + "kg");
                    break;
                case 2:
                    peso = altura - 120;
                    System.out.println("Su peso ideal es " + peso + "kg");
                    break;
                default:
                    System.out.println("Error, debe ingresar 1 para hombre ó 2 para mujer");

            }
        }
        else System.out.println("El programa, solo calcula para alturas mayores a 120 cm");



    }
}
