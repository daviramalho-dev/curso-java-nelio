package secao08_introduçao_POO.exercicios.Aula77_Exercicio3.entities;

public class Nota {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public double notaFaltando() {
        if (notaFinal() < 60) {
            return 60 - notaFinal();
        } else {
            return 0;
        }
    }

    public boolean aprovado() {
        return notaFinal() >= 60;
    }
}
