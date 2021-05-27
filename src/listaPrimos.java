import java.util.Scanner;
public class listaPrimos {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Ingrese un numero entero positivo: ");
            num = scanner.nextInt();
            if (num > 0) {
                for (int i = 2; i <=num; i++) {
                    int contador = 2;
                    boolean esPrimo = true;
                    while (esPrimo && contador < i) {
                        if (i % contador == 0) {
                            esPrimo = false;
                        } else {
                            contador++;
                        }
                    }
                    if (esPrimo == true) {
                        System.out.println(i + " es numero primo");
                    }
                }
                {break;}
            }
            else System.out.println("El numero ingresado no es correcto");
        }
    }
}


