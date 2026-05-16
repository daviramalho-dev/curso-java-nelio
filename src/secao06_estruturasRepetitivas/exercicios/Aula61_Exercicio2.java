package secao06_estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class Aula61_Exercicio2 {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        /*
         * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
         * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
         * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
         * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
         * "out" para fora do intervalo).
         */

        int n, x, in = 0, out = 0;

        System.out.println("Digite um valor de quantos numeros vao ser:");
        n = daviScanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nDigite o valor da posiçao " + i + "°");
            x = daviScanner.nextInt();

            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println("\n" + in + " in");
        System.out.println(out + " out");
    }
}
