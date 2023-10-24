import java.util.*;
import java.lang.Integer;

public class ex8_1 {
    
    public static double lerNumero() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um número:");
        
        double resultado = leitor.nextDouble();
        return resultado;
    }

    public static void main(String args[]) {
        double num_lido;
        double maior_ate_agora = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            num_lido = lerNumero();
            if(num_lido > maior_ate_agora) {
                maior_ate_agora = num_lido;
            }
        }
        System.out.println("O maior número lido foi: " + maior_ate_agora);
    }
}