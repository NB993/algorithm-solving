package nadongbin.part2.sort;

import java.util.Scanner;

public class Sort_2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    //계수정렬
    int[] arr = new int[100_000 + 1];

    for (int i = 0; i < N; i++) {
      arr[sc.nextInt()]++;
    }

    for (int i = 100_000; i >= 1; i--) {
      if (arr[i] > 0) {
        System.out.println(i);
      }
    }


  }
}
