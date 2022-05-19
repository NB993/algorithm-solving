package beakjoon.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main_1260 {

    public static int n, m, v;
    public static boolean[][] node;
    public static boolean[] flagMap;
    public static List<Integer> dfsResult = new ArrayList<>();
    public static List<Integer> bfsResult = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //정점의 개수
        m = sc.nextInt(); //간선의 개수
        v = sc.nextInt(); //탐색을 시작할 정점의 번호

        node = new boolean[n + 1][n + 1];
        flagMap = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            node[start][end] = true;
            node[end][start] = true;
        }
        dfsResult.add(v);
        dfs(v);
        bfs(v);
        for (Integer integer : dfsResult) {
            System.out.print(integer + " ");
        }

        System.out.println();
        for (Integer integer : bfsResult) {
            System.out.print(integer + " ");
        }
    }

    public static void dfs(int start) {
        for (int i = 1; i <= n; i++) {
            if (node[start][i]) {
                if (!dfsResult.contains(i)) {
                    dfsResult.add(i);
                    dfs(i);
                }
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        bfsResult.add(start);
        while (!q.isEmpty()) {
            int num = q.poll();
            for (int i = 1; i <= n; i++) {
                if (node[num][i]) {
                    if (!bfsResult.contains(i)) {
                        q.offer(i);
                        bfsResult.add(i);
                    }
                }

            }
        }
    }
}
