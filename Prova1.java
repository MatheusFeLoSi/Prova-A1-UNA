import java.util.Scanner;

public class Prova1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        //Pergunta sobre qual ano deseja
        int anoDesejado;

        System.out.println("Por favor, digite o ano desejado: ");
          anoDesejado = scanner.nextInt();
          System.out.println("------------------");
        
        //Calculo para saber se é bissexto ou não
        if ( anoDesejado%4==0 && anoDesejado%100!=0 || anoDesejado%400==0) {
            System.out.println("O ano escolhido " + anoDesejado + " é bissexto.");
            }    
        
        else {
                System.out.println("O ano escolhido " + anoDesejado + " não é bissexto.");
            }
    
    scanner.close();
    }
}

