package secao06_estruturasRepetitivas.aulas;

import java.util.Scanner;

public class Aula57_for {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        int numero, soma = 0;

        System.out.println("Digite quantas vezes vai ser repetido:");
        numero = daviScanner.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println("Digite o numero da posiçao " + i);
            int x = daviScanner.nextInt();

            soma += x;
        }
        System.out.println(soma);
    }
}
