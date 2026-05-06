package secao04_estruturaSequencial.exercicios;

import java.util.Scanner;

public class Aula36_Exercicio1 {
    public static void main(String[] args) {
        /*  Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos */
        Scanner daviScanner  = new Scanner(System.in);
        int a,b,resultado;
        
        System.out.println("DIGITE O PRIMEIRO NUMERO:");
        a = daviScanner.nextInt();
        
        System.out.println("DIGITE O SEGUNDO NUMERO:");
        b = daviScanner.nextInt();
        
        resultado = a + b;
        
        System.out.println("SOMA = " + resultado);
        
        
    }
}
