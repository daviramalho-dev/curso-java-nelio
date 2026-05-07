package secao05_estruturaCondicional.aulas;

import java.util.Scanner;

public class Aula46_switchCase {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        byte x = daviScanner.nextByte();
        String dia;
        
        switch (x) {
        case 1:
        dia = "domingo";
        break;
        case 2:
        dia = "segunda";
        break;
        case 3:
        dia = "terca";
        break;
        case 4:
        dia = "quarta";
        break;
        case 5:
        dia = "quinta";
        break;
        case 6:
        dia = "sexta";
        break;
        case 7:
        dia = "sabado";
        break;
        default:
        dia = "valor invalido";
        break;
        }
        
        System.out.println("Dia da semana: " + dia);
    }
}
