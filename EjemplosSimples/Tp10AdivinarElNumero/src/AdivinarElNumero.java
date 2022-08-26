import java.util.Random;
import java.util.Scanner;

public class AdivinarElNumero {

    public static void main(String[] args) {
	// write your code here
        int min,max,random,x;
        max=100;
        min=1;
        Random r = new Random();
        random= r.nextInt(max)+min;
        System.out.println("Ingrese un numero del 1 al 100");
        Scanner s = new Scanner(System.in);
        x= s.nextInt();
        if (x>=1 && x<=100 ) {
            while (random != x) {
                if (x < random) System.out.println("El numero buscado es MAYOR");
                else if (x > random) System.out.println("El numero buscado es MENOR");
                System.out.println("Vuelva a intentar");
                x = s.nextInt();
            }
            System.out.println("Correcto!");
        }
        else System.out.println("Error, debe ingresar un numero del 1 al 100");
    }
}
