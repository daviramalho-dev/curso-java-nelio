package secao05_estruturaCondicional.exercicios;

import java.util.Scanner;

public class Aula44_Exercicio4_HorasJogoComeçou {
    public static void main(String[] args) {
        /*
         * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
         * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
         * uma duração mínima de 1 hora e máxima de 24 horas
         */
        Scanner daviScanner = new Scanner(System.in);
        double horaInicio, horaFinal, resultado;

        System.out.println("Que horas o jogo começou?");
        horaInicio = daviScanner.nextDouble();

        System.out.println("Que horas o jogo terminou?");
        horaFinal = daviScanner.nextDouble();

        if (horaInicio < horaFinal) {
            resultado = horaInicio - horaFinal;
        } else {
            resultado = 24 - horaInicio + horaFinal;
        }

        // EXPLICAÇAO 
        /*
         * O problema é descobrir se o jogo virou a meia-noite ou não. Se a hora inicial
         * for menor que a final, não virou o dia, então basta subtrair as horas.
         * 
         * Caso contrário, o jogo passou da meia-noite. Fazemos 24 - horaInicial para
         * saber quantas horas faltavam até meia-noite, depois somamos com a horaFinal.
         * 
         */

    }
}
