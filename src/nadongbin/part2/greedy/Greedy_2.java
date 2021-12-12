package nadongbin.part2.greedy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Greedy_2 {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr); //괜히 내림차순으로 정렬할 필요는 없지..

    int biggestNum = arr[n - 1];
    int secondNum = arr[n - 2];

    // [제일 큰수 * k + 다음 큰수] 를 한 단위로 더하는 횟수를 계산.
    int biggestNumMultiplyCount = (m / k + 1) * k;
    biggestNumMultiplyCount += m % (k + 1);

    int result = 0;
    result += biggestNumMultiplyCount * biggestNum;
    result += (m - biggestNumMultiplyCount) * secondNum;
    System.out.println(result);
  }

}
