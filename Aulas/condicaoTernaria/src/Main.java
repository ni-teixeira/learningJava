public class Main {

    public static void main(String[] args) {

        double price = 34.5;

        // o preco eh menor q 20? se sim faz o calculo * 0.1, se nao faz o calculo 0.05
        double disc = (price < 20.0) ? price * 0.1 : price * 0.05;
    }

}