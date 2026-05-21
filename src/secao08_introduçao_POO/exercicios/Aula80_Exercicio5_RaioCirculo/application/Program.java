package secao08_introduçao_POO.exercicios.Aula80_Exercicio5_RaioCirculo.application;

import java.util.Scanner;

import secao08_introduçao_POO.exercicios.Aula80_Exercicio5_RaioCirculo.util.CircleCalculator;

public class Program {
    public static void main(String[] args) {
        /*
         * Faça um programa para ler o raio de um círculo e calcular sua área. Criar uma
         * classe CircleCalculator com constante estática para PI (3.14159) e método
         * estático responsável pelo cálculo.
         */
        Scanner daviScanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = daviScanner.nextDouble();

        double result = CircleCalculator.raioCircle(radius);
        System.out.printf("Circle area = %.2f%n", result);

        daviScanner.close();
    }
}
