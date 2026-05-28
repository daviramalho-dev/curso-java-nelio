package secao09_construtoresSobrecargaEncapsulamento.exercicios.Aula90_Exercicio4_AutonomiaCarro.application;

import secao09_construtoresSobrecargaEncapsulamento.exercicios.Aula90_Exercicio4_AutonomiaCarro.entities.Car;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        /*
         * EXERCÍCIO 4 - CAR
         * Criar uma classe Car com:
         * - model
         * - fuel
         *
         * Regras:
         * - cada 10 km consome 1 litro;
         * - não pode dirigir sem combustível suficiente.
         *
         * Métodos esperados:
         * - refuel(double liters)
         * - drive(double km)
         * - toString()
         *
         * O programa deve:
         * 1. Ler os dados do carro;
         * 2. Abastecer ou iniciar com combustível;
         * 3. Tentar dirigir;
         * 4. Mostrar combustível restante;
         * 5. Informar erro caso combustível seja insuficiente.
         */
        System.out.println("Model: ");
        String model = daviScanner.nextLine();
        System.out.println("Initial fuel: ");
        double initialFuel = daviScanner.nextDouble();

        Car car = new Car(model, initialFuel);

        System.out.println("Drive: ");
        car.drive(daviScanner.nextDouble());

        /* Não é necessário verificar o combustível aqui pois o metodo drive e VOID
         e já trata internamente a lógica de negócio (encapsulamento),
         imprimindo "Not enough fuel" caso necessário.*/
        System.out.println(car);

        daviScanner.close();
    }
}
