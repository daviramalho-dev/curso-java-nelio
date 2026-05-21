package secao08_introduçao_POO.exercicios.Aula80_Exercicio4.application;

import java.util.Scanner;

import secao08_introduçao_POO.exercicios.Aula80_Exercicio4.util.FuelConsumption;

public class Program {
    public static void main(String[] args) {
        /*
         * Faça um programa para ler a distância percorrida e o consumo do carro
         * (km/litro), calculando o custo total do combustível. Considerar que o litro
         * da gasolina custa R$ 5.50. Criar uma classe FuelConsumption com constante
         * estática para o preço do litro.
         */
        Scanner daviScanner = new Scanner(System.in);
         System.out.println("Enter the distance (km): ");
         double distance = daviScanner.nextDouble();
         
         System.out.println("Enter the car's consumption (km/l): ");
         double consumption = daviScanner.nextDouble();
         
         double converter = FuelConsumption.gasolina(distance, consumption);
         System.out.printf("Total fuel cost = %.2f%n" , converter);
        
        
        daviScanner.close();
    }
}
