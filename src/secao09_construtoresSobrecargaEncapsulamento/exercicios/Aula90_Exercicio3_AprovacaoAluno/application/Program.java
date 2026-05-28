package secao09_construtoresSobrecargaEncapsulamento.exercicios.Aula90_Exercicio3_AprovacaoAluno.application;

import secao09_construtoresSobrecargaEncapsulamento.exercicios.Aula90_Exercicio3_AprovacaoAluno.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        /*
         * EXERCÍCIO 3 - STUDENT
         * Criar uma classe Student com:
         * - name
         * - grade1
         * - grade2
         * - grade3
         *
         * Regras:
         * - calcular nota final;
         * - informar se foi aprovado;
         * - caso reprovado, informar quantos pontos faltaram.
         *
         * Métodos esperados:
         * - finalGrade()
         * - missingPoints()
         * - isApproved()
         *
         * Considere aprovação com 60 pontos.
         */

        System.out.println("Name: ");
        String name = daviScanner.nextLine();
        System.out.println("Grade 1: ");
        double grade1 = daviScanner.nextDouble();
        System.out.println("Grade 2: ");
        double grade2 = daviScanner.nextDouble();
        System.out.println("Grade 3: ");
        double grade3 = daviScanner.nextDouble();

        Student student = new Student(name, grade1, grade2, grade3);

        System.out.println(student);

        if (student.isApproved()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", student.missingPoints())
                    + " POINTS"
            );
        }
        daviScanner.close();
    }
}
