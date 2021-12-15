package nadongbin.part3.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Greedy_4 {

  public static void main(String[] args) {
    //정답
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    List<Integer> arrayList = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      arrayList.add(sc.nextInt());
    }

    Collections.sort(arrayList);

    int target = 1;
    for (int i = 0; i < n; i++) {
      // 만들 수 없는 금액을 찾았을 때 반복 종료
      if (target < arrayList.get(i)) break;
      target += arrayList.get(i);
    }

    System.out.println(target);

    // 내 코드
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int[] arr = new int[n];
//
//    for (int i = 0; i < n; i++) {
//      arr[i] = sc.nextInt();
//    }
//    Arrays.sort(arr);
//
//    int result = 0;
//    for (int i = 0; i < n - 1; i++) {
//      result += arr[i];
//    }
//
//    System.out.println(result);

  }
}
