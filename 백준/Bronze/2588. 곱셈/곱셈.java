import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int result1 = A*(B%10);
        int result2 = A*((Math.floorDiv(B, 10)%10));
        int result3 = A*((Math.floorDiv(B,100))%10);
        int result4 = result1 + (result2*10) + (result3*100);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        scanner.close();
    }
}