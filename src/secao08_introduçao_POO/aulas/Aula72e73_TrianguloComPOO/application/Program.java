package secao08_introduçao_POO.aulas.Aula72e73_TrianguloComPOO.application;

import java.util.Scanner;

import secao08_introduçao_POO.aulas.Aula72e73_TrianguloComPOO.entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        
        Triangle x,y;
         x = new Triangle();
         y = new Triangle();
        
        System.out.println("Enter the measures of triangle X: ");
        x.a = daviScanner.nextDouble();
        x.b = daviScanner.nextDouble();
        x.c = daviScanner.nextDouble();
        
        System.out.println("Enter the measures of triangle Y: ");
        y.a = daviScanner.nextDouble();
        y.b = daviScanner.nextDouble();
        y.c = daviScanner.nextDouble();

        double areaX = x.area();

        double areaY = y.area();
        
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
    }
}
