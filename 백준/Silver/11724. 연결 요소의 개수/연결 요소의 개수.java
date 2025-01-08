import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//DFS 11724
public class Main {
	//방문 기록 저장 배열
	static boolean visited[];
	//그래프 데이터 저장 인접 리스트
	static ArrayList<Integer>[] A;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //1
		int m = Integer.parseInt(st.nextToken()); //2
		
		visited = new boolean[n+1];
		A = new ArrayList[n+1];
		//인접 리스트의 각 ArrayList 초기화하기
		for(int i=0; i<n+1; i++) {
			A[i] =new ArrayList<Integer>();
		}
		//인접 리스트에 데이터 저장(에지 수만큼 반복) 
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			//시작점 설정
			int s = Integer.parseInt(st.nextToken());
			//종료점 설정
			int e = Integer.parseInt(st.nextToken());
			//양방향으로 접근 가능
			A[s].add(e);
			A[e].add(s);
		}	
		int count = 0;
		
		//n의 개수만큼 반복하기
		for(int i=1 ; i<n+1; i++) {
			if(!visited[i]) { //방문하지 않은 노드면
				DFS(i);
				count++;
			}
		}
		System.out.println(count);
	}

	private static void DFS(int v) {
		if(visited[v]) {//현재 노드가 방문노드이면, 탐색X
			return;
		}
		visited[v] = true; 
		for(int i : A[v]) {
		if(!visited[i]) {
			DFS(i); //재귀함수형태
			}
		}
	}
}