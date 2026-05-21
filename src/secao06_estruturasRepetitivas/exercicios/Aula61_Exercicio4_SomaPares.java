package secao06_estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class Aula61_Exercicio4_SomaPares {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        /*
         * Fazer um programa para ler um número N. Depois leia N pares de números e
         * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
         * mostrar a mensagem "divisao impossivel".
         */
        
        double n,numero1,numero2,soma = 0;
        
        System.out.println("Digite quantas contas você quer fazer:");
        n = daviScanner.nextDouble();
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nDigite o primeiro numero");
            numero1 = daviScanner.nextDouble();
            
            System.out.println("\nDigite o segundo numeero");
            numero2 = daviScanner.nextDouble();
            
            soma = numero1 / numero2;
            
            if (numero2 == 0) {
                System.out.println("divisao impossivel");
            }
            System.out.println("SOMA DO PAR N°"+ i + " = " + soma);
        }
    }
}
