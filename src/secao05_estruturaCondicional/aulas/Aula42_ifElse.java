package secao05_estruturaCondicional.aulas;

import java.util.Scanner;

public class Aula42_ifElse {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);

        int horas;

        System.out.println("Quantas horas sao: ");
        horas = daviScanner.nextInt();

        if (horas <= 12) {
            System.out.println("Bom dia!");
        } else if (horas <= 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}
