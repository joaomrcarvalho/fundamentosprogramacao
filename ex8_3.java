import java.util.*;

public class ex8_3 {

    public static int fatorial(int num) {
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial = fatorial * i;
        }

        return fatorial;
    }

    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o número para calcular o fatorial");
        int n = leitor.nextInt();
        System.out.println(fatorial(n));

    }

}