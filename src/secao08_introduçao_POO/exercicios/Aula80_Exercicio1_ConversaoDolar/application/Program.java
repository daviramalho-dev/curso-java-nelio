package secao08_introduçao_POO.exercicios.Aula80_Exercicio1_ConversaoDolar.application;

import java.util.Scanner;

import secao08_introduçao_POO.exercicios.Aula80_Exercicio1_ConversaoDolar.util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        /*
         * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
         * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
         * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
         * sobre o valor em dólar. Criar uma classe CurrencyConverter para ser
         * responsável pelos cálculos
         */
        Scanner daviScanner = new Scanner(System.in);
        double dolar, manyDollar, result;

        System.out.println("What´s the dollar price? ");
        dolar = daviScanner.nextDouble();

        System.out.println("How many dollars will be bought? ");
        manyDollar = daviScanner.nextDouble();
        
        
        double totalComIOF = CurrencyConverter.dollarToReal(dolar,manyDollar);
        System.out.printf("Amount to be paid in reais = %.2f%n", totalComIOF);

        daviScanner.close();
    }
}
