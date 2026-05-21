package secao08_introduçao_POO.exercicios.Aula77_Exercicio1_CalculosTriangulo.application;

import java.util.Scanner;

import secao08_introduçao_POO.exercicios.Aula77_Exercicio1_CalculosTriangulo.entities.Retangulo;

public class Program {
    public static void main(String[] args) {
        /*
         * Fazer um progama para ler os valores da larguara e altura de um retângulo.Em
         * seguida, mostrar na tela o valor de sua área, perímetroe diagonal.
         */
        Scanner daviScanner = new Scanner(System.in);
        Retangulo rectagle = new Retangulo();

        System.out.println("Enter rectangle width and height");
        rectagle.width = daviScanner.nextDouble();
        rectagle.height = daviScanner.nextDouble();

        System.out.printf("AREA = %.2f%n", rectagle.area());
        

        System.out.printf("PERIMETER = %.2f%n", rectagle.perimeter());

        System.out.printf("DIAGONAL = %.2f%n", rectagle.diagonal());
        
        

        daviScanner.close();
    }
}
