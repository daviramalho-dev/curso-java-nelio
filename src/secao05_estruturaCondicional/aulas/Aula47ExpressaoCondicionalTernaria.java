package secao05_estruturaCondicional.aulas;

import java.util.Scanner;

public class Aula47ExpressaoCondicionalTernaria {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        
        double preco = 34.5;
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        // ESTRUTURA <tipo> <variavel> = (condiçao) ? condiçao verdadeira : condiçao falsa;
        
//        if (preco > 20) {
//            desconto = preco * 0.1;
//        }else {                                ESSE IF-ELSE PODE TROCADO TOTALMENTE
//            desconto = preco * 0.05;           PELA LINHA 10 USANDO O TERNARIO
//        }
        
        System.out.println(desconto);
        
    }
}
