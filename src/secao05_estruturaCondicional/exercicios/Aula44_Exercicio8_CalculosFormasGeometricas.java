package secao05_estruturaCondicional.exercicios;

import java.util.Scanner;

public class Aula44_Exercicio8_CalculosFormasGeometricas {
    public static void main(String[] args) {
        /*
        Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes
        em pagar seus impostos, pois sabem que nele não existem políticos corruptos
        e os recursos arrecadados são utilizados em benefício da população,
        sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

        Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
        de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar
        de Imposto de Renda, segundo a tabela abaixo.

        Renda                          | Imposto de Renda
        de R$ 0.00 a R$ 2000.00        | Isento
        de R$ 2000.01 até R$ 3000.00   | 8%
        de R$ 3000.01 até R$ 4500.00   | 18%
        acima de R$ 4500.00            | 28%

        Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8%
        apenas sobre R$ 1000.00, pois a faixa de salário que fica de
        R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.

        No exemplo fornecido:
        8% sobre R$ 1000.00 + 18% sobre R$ 2.00
        Resultado = R$ 80.36

        O valor deve ser impresso com duas casas decimais.
        */ 
        Scanner daviScanner = new Scanner(System.in);
        double salario, resultado = 0;
        System.out.println("Digite seu salario");
        salario = daviScanner.nextDouble();

        if (salario <= 2000) {
            System.out.println("Isento");
        } else if (salario <= 3000) {
            resultado = (salario - 2000) * 0.08;
        } else if (salario <= 4500) {
            resultado = (salario - 3000) * 0.18 + 1000 * 0.08;
        } else {
            resultado = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        if (salario > 2000) {
            System.out.printf("R$%.2f%n", resultado);
        }
        /*EXLPICAÇAO:
        Até 2000 o salario é isento.

        Acima de 2000 até 3000, paga 8% somente sobre o valor
        que passou dos 2000.

        Se o salario passar de 3000, significa que ele ja ocupou
        toda a faixa anterior (2000 ate 3000), entao ja existe
        1000 reais pagando 8%.

        Depois disso, paga 18% apenas sobre o valor que passou
        de 3000.

        Acima de 4500, o salario tambem ja ocupou toda a faixa
        de 3000 ate 4500, que possui 1500 reais pagando 18%.

        Entao no ultimo caso:
        - 1000 reais pagam 8%
        - 1500 reais pagam 18%
        - o restante acima de 4500 paga 28%
        */
    }
}
