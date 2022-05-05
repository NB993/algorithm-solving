package beakjoon.brute_force;

import java.util.*;
import java.io.*;

public class Main_1018 { //체스판 다시 칠하기 (https://st-lab.tistory.com/101)


    private static boolean[][] board;
    private static int min = 64; // 색을 새로 칠해야 할 최소 개수를 비교하기 위해 디폴트로 8x8 최대값을 세팅.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);

        board = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            for (int j = 0; j < row.length(); j++) {
                if (row.charAt(j) == 'W') {
                    board[i][j] = true;
                } else { //'B'
                    board[i][j] = false;
                }
            }
        }

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                checkBoard(i, j);
            }
        }
        System.out.println(min);
    }

    private static void checkBoard(int i, int j) {
        boolean TF = board[i][j];
        int count = 0;

        for (int k = i; k < i + 8; k++) {
            for (int l = j; l < j + 8; l++) {
                if (board[k][l] != TF) {
                    count++;
                }
                TF = !TF; //칸을 이동할 때마다 색 반전
            }
            TF = !TF; //아랫줄로 이동할 때에도 색 반전
        }

        //첫 칸을 검정색으로 칠하는 경우와 흰색으로 칠하는 경우밖에 없음. 그 두 경우를 비교하기 위한 코드.
        count = Math.min(count, 64 - count);

        min = Math.min(min, count);
    }

}
