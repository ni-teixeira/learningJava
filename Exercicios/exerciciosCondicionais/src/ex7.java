import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x;
        double y;

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0){
            System.out.println("Origem");
        } else if (x > 0 && y > 0){
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else{
            System.out.println("Eixos");
        }

        sc.close();

    }

}
