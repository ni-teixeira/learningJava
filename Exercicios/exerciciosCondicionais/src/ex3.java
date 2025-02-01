import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 % num2 == 0){
            System.out.println("sao multiplos");
        } else if (num2 % num1 == 0) {
            System.out.println("sao multiplos");
        }
        else{
            System.out.println("nao sao multiplos");
        }

        sc.close();
    }

}
