import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String grade = br.readLine();
		double answer = 0;
		
		char gradeEng = grade.charAt(0);
		
		if(gradeEng == 'A') {
			answer = 4;
		} else if(gradeEng == 'B') {
			answer = 3;
		} else if(gradeEng == 'C') {
			answer = 2;
		} else if(gradeEng == 'D') {
			answer = 1;
		} else if(gradeEng == 'F') {
			answer = 0.0;
		}
		if(grade.length() == 2) {
			char gradeNum = grade.charAt(1);
			if(gradeNum == '+') {
				answer += 0.3;
			} else if(gradeNum == '-') {
				answer -= 0.3;
			}
		}
		System.out.print(answer);
	}
}