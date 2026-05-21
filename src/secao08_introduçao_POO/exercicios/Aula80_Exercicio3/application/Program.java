package secao08_introduçao_POO.exercicios.Aula80_Exercicio3.application;

import java.util.Scanner;

import secao08_introduçao_POO.exercicios.Aula80_Exercicio3.util.DiscountCalculator;

public class Program {
    public static void main(String[] args) {
        /*
         * Faça um programa para ler o preço de um produto e calcular quanto o cliente
         * pagará com 15% de desconto. Criar uma classe DiscountCalculator com constante
         * estática para a taxa de desconto e método estático responsável pelo cálculo.
         */
        Scanner daviScanner = new Scanner(System.in);
        
        System.out.println("Enter the product price: ");
        double price = daviScanner.nextDouble();
        
        
        double result = DiscountCalculator.priceWithDiscount(price);
        System.out.printf("\nPrice with discount = ",result );
        
        
        daviScanner.close();
    }
}
