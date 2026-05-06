package secao04_estruturaSequencial.aulas;

import java.util.Scanner;

public class Aula34_EntradaDados2 {
	public static void main(String[] args) {
		Scanner daviScanner  = new Scanner(System.in);
		String s1, s2, s3;
		
		s1 = daviScanner .nextLine();
		s2 = daviScanner .nextLine();
		s3 = daviScanner .nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}
}
