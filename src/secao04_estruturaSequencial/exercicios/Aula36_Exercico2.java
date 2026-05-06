package secao04_estruturaSequencial.exercicios;

import java.util.Scanner;

public class Aula36_Exercico2 {
    public static void main(String[] args) {
        /*  Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
            casas decimais conforme exemplos */
        Scanner daviScanner  = new Scanner(System.in);
        double r,raio,resultado;
        
        r = 3.14159;
        
        System.out.println("Qual o valor do raio:");
        raio = daviScanner.nextDouble();
        
        resultado = r * Math.pow(raio, 2);
        
        System.out.printf("A = %.4f " , resultado);
    }
}
