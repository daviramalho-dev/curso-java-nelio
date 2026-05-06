package secao04_estruturaSequencial.exercicios;

import java.util.Scanner;

public class Aula36_Exercico6 {
    public static void main(String[] args) {
    /*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B
    */
        Scanner daviScanner = new Scanner(System.in);
        
        double a,b,c,pi = 3.14159;
        double triangulo,raio,trapezio,quadrado,retangulo;
        
        System.out.println("Digite o A: ");
        a = daviScanner.nextDouble();
        
        System.out.println("Digite o B: ");
        b = daviScanner.nextDouble();
        
        System.out.println("Digite o C: ");
        c = daviScanner.nextDouble();
        
        triangulo = a * c / 2;
        raio = pi * Math.pow(c, 2);
        trapezio = (a + b) / 2 * c;
        quadrado = Math.pow(b, 2);
        retangulo = a * b;
        
        System.out.printf("%nTRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", raio);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
        
        
        
        
        
        
        
        
        
    }

}
