package beakjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_9237 {
  //이장님 초대
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);

    int day = 1;
    int max = arr[N - 1] + day;
    for (int i = N - 1; i > 0; i--) {
      day++;
      if (max < arr[i - 1] + day) {
        max = arr[i - 1] + day;
      }
    }
    System.out.println(max + 1);
  }
}
