import java.util.*;

public class ex6_7 {
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Número para a tabuada:");
        int n = leitor.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + (i*n) );
        }
    }

}