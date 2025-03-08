package entities;

public class currencyConverter {
    public static double dolar;
    public static double valorDolar;

    public static double conversao() {
        return dolar * valorDolar + (dolar * valorDolar * 0.06);
    }
}
