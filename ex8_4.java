import java.util.*;

public class ex8_4 {

    public static String indicaNomeMes(int mes) {
        switch(mes){
            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Mês inválido!";
        }
    }

    public static int indicaDiasMes(int mes, int ano) {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
         mes == 8 || mes == 10 || mes == 12) {
            return 31;
         }
        
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        }

        if (mes == 2) {
            // if(verificaBissexto(ano) == true) {
            if(verificaBissexto(ano)) {
                return 29;
            }else {
                return 28;
            }
        }

        return -1;
    }

    public static boolean verificaBissexto(int ano) {
        if (ano % 100 == 0) {
            if (ano % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (ano % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o mês:");
        int m = leitor.nextInt();
        System.out.println("Insira o ano:");
        int a = leitor.nextInt();
        
        //No ano 2000, o mês de Janeiro tem 31 dias.
        System.out.println("No ano " + a + ", o mês de " + indicaNomeMes(m) + " tem " + indicaDiasMes(m, a) + " dias.");
    }

}