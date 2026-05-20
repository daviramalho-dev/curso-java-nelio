package secao07_outrosTopicos.aulas;

import java.util.Scanner;

public class Aula68_funcoes {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        int a = daviScanner.nextInt();
        int b = daviScanner.nextInt();
        int c = daviScanner.nextInt();
        
        int higher = max(a, b, c);
        
        showResult(higher);
    }

    public static int max(int x, int y, int z) {
        
        int aux;
        
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}
