package secao08_introduçao_POO.exercicios.Aula80_Exercicio2_ConverterCelsiusFarh.util;

public class TemperatureConverter {

    public static final double TEMP = 1.8;

    public static double celsiusToFahreit(double celsius) {
        return celsius * TEMP + 32;
    }
}
