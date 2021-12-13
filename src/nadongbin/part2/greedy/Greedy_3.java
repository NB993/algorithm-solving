package nadongbin.part2.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); //행
    int m = sc.nextInt(); //열

    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    int biggest = 0;
    for (int i = 0; i < i; i++) {
      Arrays.sort(arr[i]);
      for (int j = 0; j < m; j++) {
        if (arr[i][0] > biggest) {
          biggest = arr[i][0];
        }
      }
    }

  }

}
