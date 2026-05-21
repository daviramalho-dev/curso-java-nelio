package secao08_introduçao_POO.exercicios.Aula80_Exercicio3_DescontoCliente.util;

public class DiscountCalculator {
    public static final double DISCOUNT = 0.15;
    
    public static double priceWithDiscount(double price) {
        return price - (price * DISCOUNT);
    }

}
