package nadongbin.part3.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);

    int result = 0;
    for (int i = 0; i < n - 1; i++) {
      result += arr[i];
    }

    System.out.println(result);

  }
}
