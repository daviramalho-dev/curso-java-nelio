package secao06_estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class Aula61_Exercico3_ValorPesos {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        /*
         * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
         * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
         * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
         * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
         * o terceiro valor tem peso 5.
         */
        
        int n;
        double v1,v2,v3,media;
        System.out.println("Digite o valor de casos de teste");
        n = daviScanner.nextInt();
        
        
        for (int i = 0; i < n; i++) {
           System.out.print("Valor 1 peso 2 ");
           v1 = daviScanner.nextDouble();
           
           System.out.print("Valor 2 peso 3 ");
           v2 = daviScanner.nextDouble();
           
           System.out.print("Valor 3 peso 5 ");
           v3 = daviScanner.nextDouble();
           
          media = ((v1 * 2) + (v2 * 3) + (v3 * 5)) / 10;
          
          System.out.println(media);
        }
        
    }
}
