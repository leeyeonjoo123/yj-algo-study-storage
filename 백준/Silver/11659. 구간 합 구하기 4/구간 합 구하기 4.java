import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		//첫번째 줄을 읽어옴
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		//읽어온 첫번째 줄 숫자를 저장할 변수 생성
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		
		//두번째줄 데이터 받기
		//합 배열 구현 : 데이터 들어옴과 동시에 합배열 저장
		long[]S = new long[suNo+1]; // long형으로 선언, suNo+1 로 한 이유는 첫번째 = 0번째 인덱스
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 1; i<=suNo ; i++) {
			// 합배열 
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		for(int q=0; q <quizNo; q++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			
			System.out.println(S[j] - S[i-1]);
		}
	}

}