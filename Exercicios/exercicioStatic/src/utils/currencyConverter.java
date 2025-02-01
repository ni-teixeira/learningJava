package utils;

public class currencyConverter {

    public static final double IOF = 0.06;

    public static double dolarReal(double preco, double qtd){
        qtd += (qtd * IOF);
        return preco * qtd;
    }

}
