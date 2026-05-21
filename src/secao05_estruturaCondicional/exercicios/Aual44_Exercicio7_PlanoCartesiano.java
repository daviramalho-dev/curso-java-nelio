package secao05_estruturaCondicional.exercicios;

import java.util.Scanner;

public class Aual44_Exercicio7_PlanoCartesiano {
    public static void main(String[] args) {
        /*
         * Leia 2 valores com uma casa decimal (x e y), que devem representar as
         * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
         * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
         * (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o
         * ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
         * situação
         */
        Scanner daviScanner = new Scanner(System.in);
        double x, y;

        System.out.println("Digite o x");
        x = daviScanner.nextDouble();

        System.out.println("Digite o y");
        y = daviScanner.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
    }
}
