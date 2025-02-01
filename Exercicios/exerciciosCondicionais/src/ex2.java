import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("par");
        }

        else{
            System.out.println("impar");
        }

        sc.close();

    }

}