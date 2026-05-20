package secao08_introduçao_POO.exercicios.Aula77_Exercicio3.application;

import java.util.Scanner;

import secao08_introduçao_POO.exercicios.Aula77_Exercicio3.entities.Nota;

public class application {
    public static void main(String[] args) {
        /*
         * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve
         * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
         * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
         * também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo,
         * quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é
         * 60% da nota). Você deve criar uma classe Student para resolver este problema.
         */
        Scanner daviScanner = new Scanner(System.in);
        Nota note = new Nota();

        note.name = daviScanner.nextLine();
        note.nota1 = daviScanner.nextDouble();
        note.nota2 = daviScanner.nextDouble();
        note.nota3 = daviScanner.nextDouble();

        System.out.println("NOTA FINAL: " + note.notaFinal());
        if (note.aprovado()) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
            System.out.println("FALTA: " + note.notaFaltando() + " Pontos");
        }
        daviScanner.close();
    }
}
