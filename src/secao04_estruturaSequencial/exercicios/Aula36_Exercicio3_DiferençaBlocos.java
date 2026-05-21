package secao04_estruturaSequencial.exercicios;

import java.util.Scanner;

public class Aula36_Exercicio3_DiferençaBlocos {
    public static void main(String[] args) {
        /*  Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
            de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D) */
        Scanner daviScanner = new Scanner(System.in);
        int a,b,c,d,resutlado;
        
        System.out.println("Digte o Primeiro Numero: ");
        a = daviScanner.nextInt();

        System.out.println("Digte o Segundo Numero: ");
        b = daviScanner.nextInt();
        
        System.out.println("Digte o Terceiro Numero: ");
        c = daviScanner.nextInt();
        
        System.out.println("Digte o Quarto Numero: ");
        d = daviScanner.nextInt();
        
        resutlado = (a * b) - (c*d);
        
        System.out.println("DIFERENCA = " + resutlado);
    }

}
