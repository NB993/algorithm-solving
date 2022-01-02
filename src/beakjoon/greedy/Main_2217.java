package beakjoon.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main_2217 {
  //로프
  public static void main(String[] args) throws IOException {
    //Scanner sc = new Scanner(System.in);
    //int N = sc.nextInt();
    //int[] arr = new int[N];
    //sc.nextLine();

    //BufferdReader가 Scanner보다 메모리랑 시간을 1/4 ~ 1/3밖에 소모하지 않았음
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    for(int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(br.readLine());
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
