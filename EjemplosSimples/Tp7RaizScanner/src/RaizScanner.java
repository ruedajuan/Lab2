import java.util.Scanner;

public class RaizScanner {

    public static void main(String[] args) {
	// Raiz cuadrada de un numero
        double x,r;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un numero");
        x= s.nextInt();
        r= Math.sqrt(x);
        System.out.println("la raiz de "+x+" es = "+r);



    }
}
