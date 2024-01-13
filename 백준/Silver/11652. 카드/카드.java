import java.util.*;
import java.io.*;

/*
알고리즘 특강에서 푼 문제.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //System.out.println("N : " + N); //N개의 숫자들

        // 숫자와 그 빈도를 저장할 자료구조 생성
        // Map<K, V> ...
        Map<Long, Integer> m = new HashMap<>();
        // 맵 -> 카드들은 중복이 가능한 형태의 여러 숫자들이 등장
        // -> 중복되지 않은 고유한 숫자 목록이 필요하고, 해당 숫자가 몇번 등장했는지
        //-> 카운팅 / 1. 인덱스 2. 해시맵 자료형의 키 -> 0++

        // 각 숫자의 빈도를 저장 (i는 0부터 ; N까지 돌꺼고 ; 증감식 해주고)

        for (int i = 0; i < N; i++) {
            // map -> 데이터를 넣는다. 데이터를 넣을 때 put 메소드 이름을 사용한다.
            // list의 경우에는 add, append(python), push(JAVA-map)
            // add -> (새로운 인덱스 자리를 만들고) 맨 끝에 데이터를 추가한다.
            //   예시. 신입생이 들어와서 새로운 사물함을 만들 때, 그 자리에 데이터를 넣는 느낌
            // put -> 특정한 키에 있는 그 자리에 데이터를 대체해서 넣겠다.
            //    예시. 기존의 사물함에 이름이 있는데, 새로운 이름이라면 그 자리에 새롭게 사물함이 생성되고, 기존에 이름이 있다면 덮어쓰기
            // 결론 대부분 put 메소드를 써라.
            long number = sc.nextLong();
            // map.getOrDefault(K, default)
            // 특정한 키(키는 중복 안되고 Put 시 대체만 됨)
            m.put(number, m.getOrDefault(number, 0) + 1); //키값이 있으면 키값을 들고오고 없으면 default 값을 불러오는 메소드 : getOrDefault
        }
        //System.out.println(m);

        // 저장한 숫자와 빈도를 순회
        // 저장된 숫자(long), 빈도 -> 배열 -> 2차원 배열
        //Set : 중복이 없는 자료형
        Set<Long> unique = m.keySet();
        long[][] arr = new long[unique.size()][2];
        Iterator<Long> keys = unique.iterator(); // 순서가 있는 객체
        Iterator<Integer> values = m.values().iterator();
        for (int i = 0; i < unique.size(); i++) {
            arr[i][0] = keys.next(); // 현재의 값을 리턴하고, 다음순서로 넘어가기
            arr[i][1] = values.next();
        }
        //System.out.println("2차원 배열 출력 : " + Arrays.deepToString(arr)); // N차원 배열 출력. 1차원 배열 출력은 toString


        // 저장된 숫자를 빈도로 정렬
        // 오름차순 : 데이터의 인덱스가 늘어나는 방향과 데이터가 커지는 방향이 일치. ascending.
        // 내림차순 : 오름차순의 반대. descending. reverse, ascending=false 으로 표현함.
        // Arrays.sort(정렬할 배열, 정렬할 방식)
        Arrays.sort(arr, (a, b) -> {
            // 같은 빈도일 경우가 빠짐. (숫자가 작을수록 우선권->0->오름차순)
            if (a[1] == b[1]) {
                return Long.compare(a[0], b[0]); // 오름차순
            }
            // arr -> 배열 [0] 고유한 숫자 [1] 그 숫자가 등장하는 빈도
            // 1차적인 정렬기준은? [1]
            // 오름차순 (a, b) => a?, b? compare -> 오름차순
            // return Long.compare(a[1], b[1]); // 큰 것은? 뒤로갑니다.
            // 오름차순 (a, b) => b?, a? compare -> 내림차순
            return Long.compare(b[1], a[1]); // 큰 것은? 앞으로 갑니다.
        });
        //System.out.println(Arrays.deepToString(arr));

        // 가장 빈도가 높은(내림차순상 0번째에 있게 되는) 숫자([0]) 출력
        System.out.println(arr[0][0]);
        // 내림차순을 통해서 -> 0번째로 위치시키고, 0 숫자, 1 빈도
    }
}