package secao06_estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class Aula56_Exercicio3 {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        /*
         * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
         * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
         * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
         * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
         * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
         * será encerrado quando o código informado for o número 4. Deve ser escrito a
         * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
         * tipo de combustível, conforme exemplo.
         */

        int escolha;
        int gasolina = 0, alcool = 0, diesel = 0;
        System.out.println("DIGITE QUAL VOCE PREFERE:\n1.Álcool 2.Gasolina 3.Diesel 4.Fim");
        escolha = daviScanner.nextInt();

        while (escolha != 4) {
            if (escolha == 1) {
                alcool++;
            } else if (escolha == 2) {
                gasolina++;
            } else if (escolha == 3) {
                diesel++;
            } else {
                System.out.println("Opçao Invalida");
            }
            System.out.println("\nDIGITE QUAL OUTRO VOCE PREFERE:\n1.Álcool 2.Gasolina 3.Diesel 4.Fim");
            escolha = daviScanner.nextInt();
        }

        System.out.println("MUITO OBRIGADO\nAlcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);

    }
}
