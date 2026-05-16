package secao06_estruturasRepetitivas.aulas;

import java.util.Scanner;

public class Aula52_while {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);

        int numero, soma = 0;
        System.out.println("Digite um numero inteiro ( 0 para parar):");
        numero = daviScanner.nextInt();

        while (numero != 0) {
            soma += numero;
            System.out.println("Digite outro numero inteiro ( 0 para parar):");
            numero = daviScanner.nextInt();
        }
        System.out.println(soma);
    }
}
