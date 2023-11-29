import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();


        int sum = A + B;
        int minus = A - B;
        int multi = A * B;
        int div = A/B;
        int quotient = A%B;
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(quotient);

        scanner.close();
    }
}