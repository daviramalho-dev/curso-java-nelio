package secao04_estruturaSequencial.aulas;

import java.util.Scanner;

public class Aula33_EntradaDados1 {
	public static void main(String[] args) {
		Scanner daviScanner  = new Scanner(System.in);
		
		String a;
		int b;
		double c;
		char d;
		
		a = daviScanner.next();
		b = daviScanner.nextInt();
		c = daviScanner.nextDouble();
		d = daviScanner.next().charAt(0);
		/*	O (d) É COMO SE FOSSE COMO O (a) STRING POREM COMO COLOQUEI O 0 ALI MOSTRA QUE INDEPENDENTE 
		   DO QUE DIGITAR VAI PEGAR APENAS O PRIMEIRO CARACTER e.g damask VAI FICAR APENAS d	*/
		
		
		System.out.println("Voce digitou: " + a );
		System.out.println("Voce digitou: " + b );
		System.out.println("Voce digitou: " + c );
		System.out.println("Voce digitou: " + d );
	}
}
