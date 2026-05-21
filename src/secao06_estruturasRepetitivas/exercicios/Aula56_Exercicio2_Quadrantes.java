package secao06_estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class Aula56_Exercicio2_Quadrantes {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        /*
         * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
         * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
         * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
         * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
         * alguma).
         */

        int x, y;

        System.out.println("Digite o X:");
        x = daviScanner.nextInt();

        System.out.println("Digite o Y:");
        y = daviScanner.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");

            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");

            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");

            } else {
                System.out.println("Quarto");
            }
            System.out.println("\nDigite o outro X:");
            x = daviScanner.nextInt();

            System.out.println("Digite o  outro Y:");
            y = daviScanner.nextInt();
        }
    }
}
