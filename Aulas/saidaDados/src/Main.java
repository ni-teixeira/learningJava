import java.util.Locale; // importa a classe locale

// criar a classe main
public class Main {

    public static void main(String[] args){ // declaracao de funcao para que o programa seja executavel

        int y = 32;
        double x = 10.101010;

        System.out.println("Olá!"); // quebra de linha
        System.out.println("Bom dia!"); // sem quebra de linha

        Locale.setDefault(Locale.US); // colocar a localizacao

        System.out.println(y);
        System.out.printf("%.2f%n", x); // printf eh para formatar as casas decimais. a mascara eh: %.2f eh a formatacao, %n eh a quebra de linha

        System.out.println("Resultado = " + x + " metros"); // concatenacao
        System.out.printf("Result = %.2f metros%n", x); // concatenacao com formatacao de numero

        String nome = "Nicoly";
        int idade = 20;
        double renda = 250.000;

        System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda); // %f ponto flutuante, %d inteiro, %s texto, %n quebra de linha
    }

}