package secao04_estruturaSequencial.aulas;

import java.util.Locale;

public class Aula31_saidaDados {
		public static void main(String[] args) {
			String product1 = "Computer";
			String product2 = "Office desk";
			
			int  age = 20;
			int code = 5290;
			char gender = 'F';
			
			double price1 = 2100.0;
			double price2 = 650.50;
			double measure = 53.234567;
			
			System.out.printf("Products:%n");
			System.out.printf("%s, which price is $%.2f %n%s, which price is $%.2f" ,product1, price1, product2, price2);
			
			System.out.println("\n\nRecord: " + age + " years old, code " + code + " and gender: " + gender);
			
			System.out.printf("\nMeasue with eight decimal places:%f%nRounded (three decimal places):%.3f",measure,measure);
	
			System.out.printf(Locale.US ,"\nUS decimal point: %.3f" ,measure);

		}
}