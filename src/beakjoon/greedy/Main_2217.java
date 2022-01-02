package beakjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2217 {
  //로프
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    sc.nextLine();

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);

    int max = arr[0] * N;
    for (int i = 1; i < N - 1; i++) {
      if (arr[i] * (N - i) > max) {
        max = arr[i] * (N - i);
      }
    }
    System.out.println(max);
  }

}
