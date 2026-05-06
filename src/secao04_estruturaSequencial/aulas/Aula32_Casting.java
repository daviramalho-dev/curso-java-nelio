package secao04_estruturaSequencial.aulas;

public class Aula32_Casting {
		public static void main(String[] args) {
			int a, b;
			double resultado;
			
			a = 5;
			b = 2;
			
			resultado = (double) a / b;
			
			System.out.println(resultado);
		
			/*	SEM O CASTING O VALOR INFORMADO SERIA 2.0 AO INVES DE 2.5 POIS COMO A E B SAO DO TIPO INTEIRO A IDE ENTENDE QUE O RESULTADO É INTEIRO 
			   ENTAO PARA FORÇAR O RESULTADO SER DO TIPO DOUBLE USAMOS O CASTING e.g (double)	*/
		}

}
