package secao09_construtoresSobrecargaEncapsulamento.exercicios.Aula90_Exercicio3_AprovacaoAluno.entities;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (!isApproved()) {
            return 60 - finalGrade();
        }else  {
            return 0;
        }
    }

    public boolean isApproved() {
        if (finalGrade() >= 60) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "FINAL GRADE = " + String.format("%.2f", finalGrade());
    }
}
