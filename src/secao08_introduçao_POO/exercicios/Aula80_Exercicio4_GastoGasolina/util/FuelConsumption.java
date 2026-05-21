package secao08_introduçao_POO.exercicios.Aula80_Exercicio4_GastoGasolina.util;

public class FuelConsumption {
    public static final double priceFuel = 5.50;
    
    public static double gasolina(double distance , double consumption) {
        return (distance / consumption ) * priceFuel;
        
    }
}
