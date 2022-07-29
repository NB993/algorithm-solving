package beakjoon.main_11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 연결 요소의 개수
 * 실버2
 * dfs
 * */
public class Main {

    public static StringTokenizer st;
    public static int n;
    public static int m;
    public static int[][] graph;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        graph = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            graph[s][d] = 1;
            graph[d][s] = 1;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) { //반복문 돌리면서 dfs 태워야하면 그냥 밖에서 visited 체크하는 걸로 하자.
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void dfs(int start) {
        visited[start] = true;

        for (int i = 1; i <= n; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

}
