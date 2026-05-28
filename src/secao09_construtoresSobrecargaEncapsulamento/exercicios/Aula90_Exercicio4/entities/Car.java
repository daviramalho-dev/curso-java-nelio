package secao09_construtoresSobrecargaEncapsulamento.exercicios.Aula90_Exercicio4.entities;

public class Car {
    private String model;
    private double fuel;

    public Car(String model, double initialFuel) {
        this.model = model;
        this.fuel = initialFuel;
    }

    public void refuel(double liters) {
        fuel += liters;
    }

    public void drive (double km) {
        double consumption = km / 10;
        if (fuel >= consumption) {
            fuel -= consumption;
        }else{
            System.out.println("Not enough fuel");
        }
    }

    public String toString() {
        return "Remaining fuel: " + String.format("%.2f",fuel) + " liters";
    }
}
