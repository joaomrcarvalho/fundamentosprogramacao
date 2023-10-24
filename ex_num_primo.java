import java.util.*;

public class ex_num_primo {
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Número para verificar se é primo:");
        int n = leitor.nextInt();
        boolean primo = true;

        if(n == 1) {
            primo = false;
        }

        // para todos os números entre 2 e n-1
        for (int i = 2; i < n; i++) {
            // se n for divisível por i, não é primo
            if(n % i == 0) {
                primo = false;
                break;
            }
        }
        if(primo == true) {
            System.out.println("É primo");
        }else {
            System.out.println("Não é primo");
        }
    }

}