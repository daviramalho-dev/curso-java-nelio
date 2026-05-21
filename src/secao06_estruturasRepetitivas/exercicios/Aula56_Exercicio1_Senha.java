package secao06_estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class Aula56_Exercicio1_Senha {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        /*
         * Escreva um programa que repita a leitura de uma senha até que ela seja
         * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
         * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
         * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
         * correta é o valor 2002
         */
        
        int senha;
        System.out.println("DIGITE A SENHA:");
        senha = daviScanner.nextInt();
        
        while (senha != 2002) {
            System.out.println("Senha Invalida!");
            senha = daviScanner.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
