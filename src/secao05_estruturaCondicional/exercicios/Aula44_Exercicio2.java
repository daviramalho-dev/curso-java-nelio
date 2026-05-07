package secao05_estruturaCondicional.exercicios;

import java.util.Scanner;

public class Aula44_Exercicio2 {
    public static void main(String[] args) {
        /*
         * Fazer um programa para ler um número inteiro e dizer se este número é par ou
         * ímpar.
         */
        Scanner daviScanner = new Scanner(System.in);
        int numero;

        System.out.println("Qual o seu numero");
        numero = daviScanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

    }
}
