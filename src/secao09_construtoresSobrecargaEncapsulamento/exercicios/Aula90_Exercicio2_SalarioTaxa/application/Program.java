package secao09_construtoresSobrecargaEncapsulamento.exercicios.Aula90_Exercicio2_SalarioTaxa.application;

import secao09_construtoresSobrecargaEncapsulamento.exercicios.Aula90_Exercicio2_SalarioTaxa.entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        /*
         * Criar uma classe Employee com:
         * - name
         * - grossSalary
         * - tax
         *
         * Regras:
         * - salário líquido deve ser calculado;
         * - salário líquido NÃO deve ser atributo;
         * - aumento salarial altera grossSalary.
         *
         * Métodos esperados:
         * - netSalary()
         * - increaseSalary(double percentage)
         * - toString()
         *
         * O programa deve:
         * 1. Ler os dados do funcionário;
         * 2. Mostrar os dados;
         * 3. Ler uma porcentagem de aumento;
         * 4. Aplicar o aumento;
         * 5. Mostrar os dados atualizados.
        */
        System.out.println("Name: ");
        String name = daviScanner.nextLine();
        System.out.println("Gross salary: ");
        double grossSalary = daviScanner.nextDouble();
        System.out.println("Tax: ");
        double tax = daviScanner.nextDouble();
        Employee employee = new Employee(name,grossSalary,tax);

        System.out.println(employee);

        System.out.println("\nWhich percentage to increase salary? ");
        double percentage = daviScanner.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Update data: " + employee);





        daviScanner.close();
    }
}
