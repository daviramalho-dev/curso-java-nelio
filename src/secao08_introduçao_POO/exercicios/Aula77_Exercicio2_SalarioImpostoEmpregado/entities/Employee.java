package secao08_introduçao_POO.exercicios.Aula77_Exercicio2_SalarioImpostoEmpregado.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    
    public double netSalary() {
        return grossSalary - tax;
    }
    
    public void increaseSalary(double percent) {
        grossSalary += grossSalary * percent / 100;
    }
    
    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
