import java.util.*;

public class ex6_4 {
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos números quer imprimir?");
        int n = leitor.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }

}