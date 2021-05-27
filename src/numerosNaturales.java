import java.util.Scanner;

public class numerosNaturales {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cuantos resultados quiere obtener: ");
        int n = scanner.nextInt();

        System.out.println("Ingrese las veces que se repite el digito: ");
        int m = scanner.nextInt();
        System.out.println("Ingrese el digito que se repite: ");
        int d = scanner.nextInt();
        scanner.close();

        int contador = 0;
        int num =d;
        while(contador < n){
            int de = 0;
            int numIt = num;
            while(numIt>0){
                if(numIt % 10 ==d){
                    de++;
                }
                numIt = numIt/10;
            }
            if(de >= m){
                System.out.println(num);
                contador++;
            }
            num++;
        }

    }
}
