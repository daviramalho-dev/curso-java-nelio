package secao06_estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class Aula61_Exercicio5 {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        /*
         * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
         * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
         * de 0 é 1.
         */

        int n,resultado = 1;

        System.out.println("Qual fatorial voce qeur saber:");
        n = daviScanner.nextInt();

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        System.out.println(resultado);
    }
}
