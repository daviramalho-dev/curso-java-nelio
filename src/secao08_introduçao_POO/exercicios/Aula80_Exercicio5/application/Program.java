package secao08_introduçao_POO.exercicios.Aula80_Exercicio5.application;

import java.util.Scanner;

import secao08_introduçao_POO.exercicios.Aula80_Exercicio5.util.CircleCalculator;

public class Program {
    public static void main(String[] args) {
        /*
         * Faça um programa para ler a distância percorrida e o consumo do carro
         * (km/litro), calculando o custo total do combustível. Considerar que o litro
         * da gasolina custa R$ 5.50. Criar uma classe FuelConsumption com constante
         * estática para o preço do litro.
         */
        Scanner daviScanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = daviScanner.nextDouble();

        double result = CircleCalculator.raioCircle(radius);
        System.out.printf("Circle area = %.2f%n", result);

        daviScanner.close();
    }
}
