import java.util.Scanner;

/*
방법1.
x가 양수이면
    y가 양수이면 -> 1 출력
    y가 양수가 아니면 -> 4 출력
x가 양수가 아니면
    y가 양수이면 -> 2 출력
    y가 양수가 아니면 -> 3 출력

방법 2. (굳이.. 방법1이랑 똑같은데)
x*y가 양수이면
    x가 양수면 -> 1출력
    x가 양수가 아니면 -> 3출력
x*y가 음수이면
    x가 양수면 -> .... 생략

  ============================
  BufferedReader를 사용했는데 줄바꿈 입력 떄문에 Scanner 써야겠다..

 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //nextLine은 String 타입이라 int로 형변환을 한다
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        
            // 입력 조건 만족하는지 확인
            checkInput(x, y);

            if (x > 0) {
                if (y > 0) {
                    System.out.println("1");
                } else if (y < 0) {
                    System.out.println("4");
                }
            } else if (x < 0) {
                if (y > 0) {
                    System.out.println("2");
                } else if (y < 0) {
                    System.out.println("3");
                }
            }
        sc.close();
    }

    
    // 입력 조건에 맞지 않은 값이 입력되면 프로그램 종료
    private static void checkInput(int x, int y) {
        if ((x < -1000 || x > 1000) || (y < -1000 || y > 1000)) {
            System.exit(0);
        }
    }
}
