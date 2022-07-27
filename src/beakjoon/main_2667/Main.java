package beakjoon.main_2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
* 단지번호붙이기
* 실버1
* dfs
* */
public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static boolean[][] visited;
    public static int[][] board;
    public static int n;
    public static int count;
    public static List<Integer> groups = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && board[i][j] != 0) {
                    count = 1;
                    dfs(j, i);
                    groups.add(count);
                }
            }
        }
        Collections.sort(groups);
        System.out.println(groups.size());
        for (Integer group : groups) {
            System.out.println(group);
        }

    }

    public static void dfs(int x, int y) {
            visited[y][x] = true;

            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < n) {
                    if (!visited[nextY][nextX] && board[nextY][nextX] == 1) {
                        dfs(nextX, nextY);
                        count++;
                    }
                }
            }
    }

}
