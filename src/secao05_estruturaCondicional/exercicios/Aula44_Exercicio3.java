package secao05_estruturaCondicional.exercicios;

import java.util.Scanner;

public class Aula44_Exercicio3 {
    public static void main(String[] args) {
        /*
         * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
         * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
         * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
         * crescente ou decrescente.
         */
        Scanner daviScanner = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Digite o primeiro numero: ");
        n1 = daviScanner.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        n2 = daviScanner.nextInt();
        
            if (n1 % n2 == 0 || n2 % n1 == 0) {
                System.out.println("Sao multiplos");
            }else {
                System.out.println("Nao sao multiplos");
            }
    }
}
