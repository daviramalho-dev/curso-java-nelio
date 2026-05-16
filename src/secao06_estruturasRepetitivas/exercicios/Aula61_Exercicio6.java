package secao06_estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class Aula61_Exercicio6 {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        /*
         * Ler um número inteiro N e calcular todos os seus divisores.
         */

        int n;

        System.out.println("Qual fatorial voce qeur saber:");
        n = daviScanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

    }
}
