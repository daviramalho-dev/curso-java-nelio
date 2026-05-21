package secao05_estruturaCondicional.exercicios;

import java.util.Scanner;

public class Aula44_Exercicio1_NegativoPositivo {
    public static void main(String[] args) {
        /*
         * Fazer um programa para ler um número inteiro, e depois dizer se este número é
         * negativo ou não
         */
        Scanner daviScanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite seu numero");
        numero = daviScanner.nextInt();

        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
    }
}
