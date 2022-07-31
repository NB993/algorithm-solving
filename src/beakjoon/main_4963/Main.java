package beakjoon.main_4963;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 섬의 개수
* 실버2
* dfs
* */

public class Main {

    public static StringTokenizer st;
    public static int w;
    public static int h;
    public static int[][] board;
    public static boolean[][] visited;
    public static int[] dx = {0, 1, 0, -1, 1, -1, 1, -1};
    public static int[] dy = {1, 0, -1, 0, -1, -1, 1, 1};
    public static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0) {
                break;
            }
            board = new int[h + 1][w + 1];
            visited = new boolean[h + 1][w + 1];

            for (int i = 1; i <= h; i++) {
                st = new StringTokenizer(br.readLine());
                int index = 1;
                while (st.hasMoreTokens()) {
                    board[i][index] = Integer.parseInt(st.nextToken());
                    index++;
                }
            }

            count = 0;
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    if (!visited[i][j] && board[i][j] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void dfs(int y, int x) {
        visited[y][x] = true;

        for (int i = 0; i < 8; i++) {
            int nextY = y + dy[i];
            int nextX = x + dx[i];
            if (0 < nextX && 0 < nextY && nextX <= w && nextY <= h && !visited[nextY][nextX] && board[nextY][nextX] == 1) {
                dfs(nextY, nextX);
            }
        }
    }

}
