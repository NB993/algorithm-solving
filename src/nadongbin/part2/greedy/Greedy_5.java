package nadongbin.part2.greedy;

import java.util.Scanner;

public class Greedy_5 {

  public static void main(String[] args) {
    //답안
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //볼링공의 개수
    int m = sc.nextInt(); //볼링공의 최대 무게

    int[] arr = new int[11]; //무게 배열

    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      arr[x] += 1;
    }

    int result = 0;

    // 1부터 m까지의 각 무게에 대하여 처리
    for (int i = 1; i <= m; i++) {
      n -= arr[i]; // 무게가 i인 볼링공의 개수(A가 선택할 수 있는 개수) 제외
      result += arr[i] * n; // B가 선택하는 경우의 수와 곱해주기
    }

    System.out.println(result);

    //내 코드
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int m = sc.nextInt();
//
//    int[] arr = new int[n];
//
//    for (int i = 0; i < n; i++) {
//      arr[i] = sc.nextInt();
//    }
//
//    int count = 0;
//    int currentBall = 0;
//    for (int i = 0; i < n - 1; i++) {
//      currentBall = arr[i];
//      for (int j = i + 1; j < n; j++) {
//        if (arr[j] == currentBall) continue;
//        count++;
//      }
//    }
//
//    System.out.println(count);
  }
}
