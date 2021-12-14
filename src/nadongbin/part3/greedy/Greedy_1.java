package nadongbin.part3.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Greedy_1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      arrayList.add(sc.nextInt());
    }

    Collections.sort(arrayList);

    int result = 0; // 총 그룹의 수
    int count = 0; // 현재 그룹에 포함된 모험가의 수

    for (int i = 0; i < n; i++) { // 공포도를 낮은 것부터 하나씩 확인하는 방식
      count += 1; // 일단 사람 카운트를 계속 늘려가다가
      if (count >= arrayList.get(i)) { // 사람수와 공포감이 일치하는 시점에
        result += 1; // 그룹 카운트를 늘린다.
        count = 0; // 사람수는 다시 초기화하고 위 과정을 반복. 그러다보면 그룹에 포함되지 않는 사람 카운트는 자연히 버려짐.
      }
    }

    System.out.println(result);



  }

}
