import java.util.*;

public class ex6_6 {
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Número para calcular o fatorial?");
        
        int n = leitor.nextInt();
        
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }

        // for (int i = n; i >= 1; i--) {
        //     fatorial = fatorial * i;
        // }

        System.out.println("Fatorial = " + fatorial);
    }

}