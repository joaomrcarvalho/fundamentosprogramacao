import java.util.*;

public class ex6_1 {
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in); 
        int num_atual;
        int maior_num = -999999;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Insira um número: ");
            num_atual = leitor.nextInt();
            if(num_atual > maior_num) {
                maior_num = num_atual;
            }
        }
        System.out.println("O maior número foi: " + maior_num);
    }

}