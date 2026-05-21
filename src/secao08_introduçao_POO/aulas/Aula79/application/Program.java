package secao08_introduçao_POO.aulas.Aula79.application;

import java.util.Scanner;

import secao08_introduçao_POO.aulas.Aula79.util.Calculator;

public class Program {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        double radius , c ,v;
        
        System.out.println("Enter radius: ");
         radius = daviScanner.nextDouble();
        
         c = Calculator.circumference(radius);
         v = Calculator.volume(radius);
         
         System.out.printf("Circumference: %.2f%n", c);
         System.out.printf("Volume: %.2f%n", v);
         System.out.printf("PI value: %.2f%n", Calculator.PI);
    }
}
