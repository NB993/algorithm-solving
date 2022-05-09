package beakjoon.binary_search;

import java.util.*;

public class Main_1654 { //랜선 자르기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();

        long[] arr = new long[K];
        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);

        long start = 0l;
        long end = arr[arr.length - 1] + 1;

        if (arr[arr.length - 1] == 1) {
            System.out.println(1);
            return;
        }

        while (start < end) {
            long quotient = 0l;
            long mid = (start + end) / 2;
            for (int i = 0; i < arr.length; i++) {
                quotient += arr[i] / mid;
            }
            if (quotient < N) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        System.out.println(start - 1);
    }
}
