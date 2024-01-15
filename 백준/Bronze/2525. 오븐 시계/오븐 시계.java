import java.io.*;
import java.lang.*;
import java.util.Scanner;


// 큰 로직 : beforeHour + beforeMin + cookingMin

// 작은 로직
// 방법1. beforeMin + cookingMin 이 60을 초과하는지 안하는지 확인 후,
//          ->  초과한다면
//                  (공통로직)
//                  ->afterHour = beforeHour + a
//                      -> a =( beforeHour + cookingMin ) / 60
//                  -> afterMin = (beforeMin + cookingMin) % 60
//          ->  초과 안하면 afterHour = beforeHour
//                  (공통로직) .. ?? 그렇다면 이렇게 할 필요가 없는데?
//          -> 출력 (afterHour afterMin)

// 방법2. afterHour가 23를 초과하는지 안하는지를 나눠서 계산, 삼항연산자로
// 2) isOver 변수를 선언 해주는게 낫나? 아니면 1) afterHour를 가지고 로직을 하는게 낫나? -> 1부터

// 방법3. (제일간단)
// totalMin = beforeHour * 60 + beforMin + cookingTime
// totalMin / 60 + totalMin % 60
// -> 여기서 totalMin / 60 >= 24 이면 totalMin / 60 - 24
// 그러면 상수를 24로 만들기

public class Main {
    private static final int LAST_HOUR = 24;
    private static final int LAST_MIN = 60;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nowTime = sc.nextLine(); // 첫째줄 read

        int beforeHour = Integer.parseInt(nowTime.split(" ")[0]); //현재 시
        int beforeMin = Integer.parseInt(nowTime.split(" ")[1]);; //현재 분
        int cookingMin = Integer.parseInt(sc.nextLine()); //요리 소요 시간(분) nextLine은 String 자료형이니깐 Int로 형변환
        int afterHour;
        int afterMin;

        // 입력 조건 만족하는지 확인
        checkInput(beforeHour, beforeMin, cookingMin);

        //(새로 알게된 부분)메서드에서 반환된 값을 변수에 저장
        afterHour = calHour(beforeMin, beforeHour, cookingMin);
        afterMin = calMin(beforeMin, beforeHour, cookingMin);

        //메서드 호출 후 반환된 값을 사용
        afterHour = checkHour(afterHour);

        System.out.println(afterHour + " " + afterMin);

        sc.close();
    }

    // 입력 조건에 맞지 않은 값이 입력되면 프로그램 종료
    public static void checkInput(int H, int M, int T) {
        if ((H < 0 || H >= LAST_HOUR) || (M < 0 || M > LAST_MIN || (T < 0 || T > 1000))) {
            System.exit(0);
        }
    }

    //after 시간을 구하는 함수
    public static int calHour(int beforeMin, int beforeHour, int cookingMin) {
        int a = (beforeMin + cookingMin) / LAST_MIN; //a =( beforeMin + cookingMin ) / 60
//        int afterHour = beforeHour + a;
//        return afterHour; -> *리팩토링 함
        return beforeHour + a;
    }

    //after 시간을 구하는 함수
    public static int calMin(int beforeMin, int beforeHour, int cookingMin) {
        int a = (beforeHour + cookingMin) / LAST_MIN; //a =( beforeHour + cookingMin ) / 60

        //afterMin = (beforeMin + cookingMin) % 60
        return (beforeMin + cookingMin) % LAST_MIN;

    }


    // afterHour가 23을 초과한다면 afterHour - 24 를 계산 아니면 after Hour 그대로 출력
    public static int checkHour(int afterHour) {
        if (afterHour >= LAST_HOUR) {
            afterHour -= LAST_HOUR; // afterHour = afterHour - LAST_HOUR;
        } return afterHour;
    }
}