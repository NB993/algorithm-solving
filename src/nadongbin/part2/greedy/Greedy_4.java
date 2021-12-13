package nadongbin.part2.greedy;

import java.util.Scanner;

public class Greedy_4 {

  public static void main(String[] args) {
    //답안 예시
    // N, K를 공백을 기준으로 구분하여 입력 받기
    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int k = sc.nextInt();
    int result = 0;
    int n = 28;
    int k = 15;

    while (true) {
      int target = (n / k) * k; // 나처럼 1씩 빼고 카운트도 1씩 늘리는 게 아니라, 나누어 떨어지지 않는 수를 한번에 다 빼고
      result += (n - target); //카운트도 한번에 올리는 방식. 만약 나누어 떨어지는 상태이면 target == n 이므로 result가 증가되지 않음.
      n = target; //target은 k로 나누어 떨어지는 수임.

      if (n < k) break; //더이상 못 나눌 때 while 탈출. 이때 n은 항상 0임.

      result += 1;
      n /= k; //k로 나누고 result카운트 업
    }

    // 마지막으로 남은 수에 대하여 1씩 빼기 -> 나누어 떨어져서 n이 1이 됐음에도 result += (n - target);이 한번 더
    // 수행되기 때문에 이때 더해진 n의 값인 1을 다시 빼줌. 그런데 여기서 n이 항상 0은 아닌 건가..? 왜 굳이 (n - 1)을 한 건지?
    result += (n - 1);
    System.out.println(result);

    //직접 푼 코드
//    Scanner sc = new Scanner(System.in);
////    int n = sc.nextInt();
////    int k = sc.nextInt();
//
//    int n = 26;
//    int k = 3;
//    int count = 0;
//
//    while (n != 1) {
//      if (n % k == 0) {
//        n /= k;
//      } else {
//        n -= 1;
//      }
//      count++;
//    }
//
//    System.out.println(count);
  }

}
