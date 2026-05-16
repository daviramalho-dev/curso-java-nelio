package secao05_estruturaCondicional.aulas;

import java.util.Scanner;

public class Aula45_operadoresAtribuiçao {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        int minutos;
        double conta = 50;
        
        System.out.println("Quantos minutos voce gastou?");
        minutos = daviScanner.nextInt();
        
        if (minutos > 100) {
            conta += (minutos - 100) * 2; // ao inves de fazer conta = conta + minutos... USA o += ou operador e = 
        }
        
        System.out.printf("Valor da conta = R$%.2f%n" , conta);
    }
}
