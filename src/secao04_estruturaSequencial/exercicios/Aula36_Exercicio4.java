package secao04_estruturaSequencial.exercicios;

import java.util.Scanner;

public class Aula36_Exercicio4 {
    public static void main(String[] args) {
    /*  Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas    
    decimais    */ 
            Scanner daviScanner = new Scanner(System.in);
            int id;
            double horas,valorHora,resultado;
            
            System.out.println("Qual seu numero de Indetificaçao: ");
            id = daviScanner.nextInt();
            
            System.out.println("Quantas horas voce trabalhou: ");
            horas = daviScanner.nextDouble();
            
            System.out.println("Quanto recebe por hora: ");
            valorHora = daviScanner.nextDouble();
            
            resultado = horas * valorHora;
            
            System.out.println("Number = " + id);
            System.out.printf("Salary = $%.2f" ,resultado);
            
    }
    
}
