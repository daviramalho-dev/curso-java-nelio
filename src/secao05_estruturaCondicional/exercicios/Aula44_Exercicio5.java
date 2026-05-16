package secao05_estruturaCondicional.exercicios;

import java.util.Scanner;

public class Aula44_Exercicio5 {

        public static void main(String[] args) {
            /*
             * Com base na tabela abaixo, escreva um programa que leia o código de um item e
             * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
             * 
             *              CODIGO | ESPECIFICACAO   | PRECO
             *                 1   | Cachorro Quente | R$ 4.00
             *                 2   | X-Salada        | R$ 4.50
             *                 3   | X-Bacon         | R$ 5.00
             *                 4   | Torrada simples | R$ 2.00
             *                 5   | Refrigerante    | R$ 1.50
             */
            Scanner daviScanner = new Scanner(System.in);
            
            int codigo,quantidade;
            double resultado;
            
            System.out.println("Qual o codigo do seu lanche? ");
            codigo = daviScanner.nextInt();
            
            System.out.println("Quantos lanches vc quer? ");
            quantidade = daviScanner.nextInt();
            
            if (codigo == 1) {
                resultado = quantidade * 4;
            }else if (codigo == 2) {
                resultado = quantidade * 4.50;
            }else if (codigo == 3) {
                resultado = quantidade * 5;
            }else if (codigo == 4) {
                resultado = quantidade * 2;
            }else {
                resultado = quantidade * 1.50;
            }
            System.out.printf("Total: R$%.2f" , resultado);
        }
}
