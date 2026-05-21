package secao06_estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class Aula61_Exercicio1_VariosImpares {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        /*
         * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
         * até X, um valor por linha, inclusive o X, se for o caso.
         */
        
       int x;
       
       System.out.println("Digite qual numero você quer saber os impares");
       x = daviScanner.nextInt();
       
       for (int i = 1; i < x; i++) {
        if (i % 2 == 1) {
            System.out.println(i);
        }
    }
            
    }
}
