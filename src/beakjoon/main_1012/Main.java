package beakjoon.main_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 유기농 배추
* 실버2
* dfs
* */
public class Main {

    public static StringTokenizer st;
    public static int n, m, k;
    public static boolean[][] visited;
    public static boolean[][] board;
    public static int count;
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            board = new boolean[n][m];
            visited = new boolean[n][m];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                board[y][x] = true;
            }

            count = 0;
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    if (dfs(l, j)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static boolean dfs(int x, int y) {
        if (x < 0 || y < 0 || m <= x || n <= y) {
            return false;
        }

        if (!visited[y][x] && board[y][x]) {
            visited[y][x] = true;
            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                dfs(nextX, nextY);
            }
            return true;
        }
        return false;
    }

}
