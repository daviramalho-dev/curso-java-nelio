package secao08_introduçao_POO.exercicios.Aula77_Exercicio2.application;

import java.util.Scanner;

import secao08_introduçao_POO.exercicios.Aula77_Exercicio2.entities.Employee;

public class Program {
    public static void main(String[] args) {
        /*
         * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e
         * imposto). Em seguida, mostrar os dados do funcionário (nome e salário
         * líquido). Em seguida, aumentar o salário do funcionário com base em uma
         * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
         * mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
         */
        
        Scanner daviScanner = new Scanner(System.in);
        Employee empregado = new Employee();
        
        System.out.println("Name: ");
        empregado.name = daviScanner.nextLine();     
        System.out.println("\nGross salary: ");
        empregado.grossSalary = daviScanner.nextDouble();
        System.out.println("\nTax: ");
        empregado.tax = daviScanner.nextDouble();
        
        System.out.println("\nEmployee: " + empregado);
        
        System.out.println("\nWhich percent to increase salary? ");
        double valor = daviScanner.nextDouble();
        empregado.increaseSalary(valor);
        
        System.out.println("Updated data: " + empregado);
        
        
        
        
        
        daviScanner.close();
    }
}
