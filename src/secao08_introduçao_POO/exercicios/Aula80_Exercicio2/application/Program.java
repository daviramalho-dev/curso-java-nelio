package secao08_introduçao_POO.exercicios.Aula80_Exercicio2.application;

import java.util.Scanner;

import secao08_introduçao_POO.exercicios.Aula80_Exercicio2.util.TemperatureConverter;

public class Program {
    public static void main(String[] args) {
        /*
         * Faça um programa para ler uma temperatura em Celsius e converter para
         * Fahrenheit. Criar uma classe TemperatureConverter com uma constante estática
         * para o multiplicador (1.8) e um método estático responsável pela conversão.
         */
        Scanner daviScanner = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        double celsius = daviScanner.nextDouble();

        double tempToatal = TemperatureConverter.celsiusToFahreit(celsius);
        System.out.printf("Temperature in Fahrenheit = %.2f%n", tempToatal);

        daviScanner.close();
    }
}
