
import java.util.Scanner;
public class main {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese multiplo: ");
        int multiplo = scanner.nextInt();
        for (int i = 1; i <= a ; i++) {
            System.out.println(i*multiplo);
            
        }

}
}
