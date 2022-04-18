package beakjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2805 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //나무의 수 N
        int M = Integer.parseInt(st.nextToken()); //가져갈 나무의 길이 M

        int[] trees = Arrays.stream(br.readLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();

        Arrays.sort(trees);

        int start = 1;
        int end = trees[N - 1];

        while (start <= end) {
            int mid = (start + end) / 2;
            long sum = 0;
            for (int i = 0; i < trees.length; i++) {
                if (trees[i] - mid > 0) {
                    sum += trees[i] - mid;
                }
            }
            if (M <= sum) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(end);
    }
}
