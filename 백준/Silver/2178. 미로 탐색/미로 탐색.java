
import java.util.*;

/*
알고리즘 특강 수업에 푼 코드.
 */

public class Main {
    // 미로를 나타내는 2차원 boolean 배열
    static boolean[][] maze;
    // 미로의 가로, 세로 크기
    static int m;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   // 미로의 세로 크기 입력
        m = sc.nextInt();   // 미로의 가로 크기 입력
        maze = new boolean[n][m];

        // 미로 정보 입력 받기 (1: 이동 가능, 0: 벽)
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = line.charAt(j) == '1';
            }
        }
        sc.close();

        // BFS로 최단 경로 찾기
        bfs();
    }

    // 너비 우선 탐색(BFS)을 사용한 최단 경로 탐색
    public static void bfs() {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0, 1});  // 시작 위치와 이동 거리

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];  // 현재 위치의 행
            int c = cur[1];  // 현재 위치의 열
            int num = cur[2];  // 현재까지의 이동 거리

            // 목적지에 도착한 경우 *(n-1, m-1 에 주의)
            if (r == n - 1 && c == m - 1) {
                System.out.println(num);
                break;
            }

            // 범위를 벗어나거나 벽인 경우
            if (r < 0 || r >= n || c < 0 || c >= m || !maze[r][c]) {
                continue;
            }

            // 이동 가능한 경우 미로 업데이트 및 큐에 추가
            maze[r][c] = false;  // 방문 표시
            q.add(new int[]{r + 1, c, num + 1});  // 아래로 이동
            q.add(new int[]{r - 1, c, num + 1});  // 위로 이동
            q.add(new int[]{r, c + 1, num + 1});  // 오른쪽으로 이동
            q.add(new int[]{r, c - 1, num + 1});  // 왼쪽으로 이동
        }
    }
}