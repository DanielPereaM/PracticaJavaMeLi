import javax.crypto.SealedObject;
import java.util.Scanner;
public class number {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();
        int contador = 0;
        for (int i = 1; i <= num ; i++) {
            if(num % i == 0) {
                contador++;
            }
        }
        if( contador <=2 && num!=1){


                System.out.println(num + " es primo");
            }
            else {
                System.out.println(num + " no es primo");
            }
        }
    }
