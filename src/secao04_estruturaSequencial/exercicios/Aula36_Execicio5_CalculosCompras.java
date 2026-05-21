package secao04_estruturaSequencial.exercicios;

import java.util.Scanner;

public class Aula36_Execicio5_CalculosCompras {
    public static void main(String[] args) {
        /*  Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
            código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago    */ 
        Scanner daviScanner = new Scanner(System.in);
        int id1,id2,np1,np2;
        double v1,v2,resultado;
        
        System.out.println("Codigo da peça numero 1");
        id1 = daviScanner.nextInt();
        
        System.out.println("Numero da peças numero 1");
        np1 = daviScanner.nextInt();
        
        System.out.println("Valor unitario da peça 1 :");
        v1 = daviScanner.nextDouble();
        
        System.out.println("Codigo da peça numero 2");
        id2 = daviScanner.nextInt();
        
        System.out.println("Numero da peças numero 2");
        np2 = daviScanner.nextInt();
        
        System.out.println("Valor unitario da peça 2 :");
        v2 = daviScanner.nextDouble();
        
        resultado = (v1 * np1) + (v2 * np2);
        
        System.out.printf("VALOR A PAGAR: R$%.2f" ,resultado);
    }

}
