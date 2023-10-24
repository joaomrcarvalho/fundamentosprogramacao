import java.util.*;

public class ex6 {
    public static void main(String args[]) {
        int num_segundos; 

        Scanner leitor = new Scanner(System.in); 

        System.out.println("Insira o número de segundos");
        num_segundos = leitor.nextInt(); 
        
        int resto;
        int horas;
        int minutos;
        int segundos;

        horas = num_segundos / 3600;
        resto = num_segundos % 3600;
        minutos = resto / 60;
        resto = resto % 60;
        segundos = resto;
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }

}