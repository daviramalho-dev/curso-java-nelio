package secao08_introduçao_POO.exercicios.Aula80_Exercicio1.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double dollarToReal(double dolar, double manyDollar) {
        return dolar * manyDollar * (1.0 + IOF); // 1.0 = o valor original (100%) e 0.06 = os 6% extras Então 1.06
                                                 // significa "o valor ORIGINAL MAIS 6%
    }
}
