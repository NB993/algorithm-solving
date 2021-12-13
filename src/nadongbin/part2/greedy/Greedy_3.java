package nadongbin.part2.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); //행
    int m = sc.nextInt(); //열
    int result = 0;

    //굳이 for문 한 번 더 돌면서 숫자 담을 필요 없음.
//    int[][] arr = new int[n][m];
//    for (int i = 0; i < n; i++) {
//      for (int j = 0; j < m; j++) {
//        arr[i][j] = sc.nextInt();
//      }
//    }

    // 행과 열 길이를 아니까 nextInt()받으면서 비교해도 됨.
    for (int i = 0; i < n; i++) {
      int minNumber = 10001; //10000 이하의 수가 입력됨
      for (int j = 0; j < m; j++) {
        int x = sc.nextInt();
        minNumber = Math.min(minNumber, x); //min() : 둘 중 작은 수를 리턴함
      }
      // '가장 작은 수'들 중에서 가장 큰 수 찾기
      result = Math.max(result, minNumber); //max() : 둘 중 큰 수를 리턴함
    }

    System.out.println(result);

  }

}
