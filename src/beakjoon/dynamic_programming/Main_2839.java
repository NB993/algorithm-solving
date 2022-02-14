package beakjoon.dynamic_programming;

import java.util.*;
import java.io.*;

public class Main_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 3 <= N <= 5000
        int INF = 999_999_999;
        int[] d = new int[N + 1];

        if (N % 3 != 0 && N % 5 != 0) {
            System.out.println(-1);
            return;
        }

        for (int i = 1; i <= 5; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                d[i] = INF;
            }
        }

        for (int i = 3; i <= N; i++) {
            d[i] = Math.min(d[i - 3] + 1, d[i - 5] + 1);
        }
        System.out.println(d[N]);


    }
}
