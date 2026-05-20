package secao08_introduçao_POO.aulas;

import java.util.Scanner;

public class Aula71_TrianguloSemPOO {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        
        System.out.println("Enter the measures of triangle X: ");
        xA = daviScanner.nextDouble();
        xB = daviScanner.nextDouble();
        xC = daviScanner.nextDouble();
        
        System.out.println("Enter the measures of triangle Y: ");
        yA = daviScanner.nextDouble();
        yB = daviScanner.nextDouble();
        yC = daviScanner.nextDouble();
        
        double p = (xA + xB + xC) / 2.0;
        
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
    }
}
