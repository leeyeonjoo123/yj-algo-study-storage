import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String st[] =  new String[num];
		
		for(int i=0; i<num; i++) {
			st[i] = br.readLine();
		}
		
		for(int i=0; i <num; i++) {
			char start = st[i].charAt(0);
			char end = st[i].charAt(st[i].length()-1);
			System.out.print(start);
			System.out.println(end);
		}

		br.close();
	}
}