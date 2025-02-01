import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < num; i++) {

            num = sc.nextInt();

            if (num >= 10 && num <= 20){
                in +=1;
            }
            else{
                out+=1;
            }

        }
        System.out.printf("%d in %n %d out", in, out);

        sc.close();
    }

}