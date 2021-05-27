import  java.util.Scanner;
public class par {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar numero: ");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
               System.out.println(i + " es par");
            }
        }
    }
    }

