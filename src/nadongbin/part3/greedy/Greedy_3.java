package nadongbin.part3.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Greedy_3 {

  public static void main(String[] args) throws IOException {
    //백준 01089292615님 코드
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] input = br.readLine().toCharArray();
    char temp = input[0];

    //1을 카운트 해놓고 시작하니까 나처럼 분기문을 작성할 필요가 없음. 앞으로 이 방식 쓰면 좋을듯.
    int answer = 1;
    for (int i = 1; i < input.length; i++) {
      if (temp != input[i]) {
        temp = input[i];
        answer++;
      }
    }
    System.out.println(answer / 2);

    //내 코드
//    Scanner sc = new Scanner(System.in);
////    String s = sc.nextLine();
//
//    String s = "0101010101";
//    int seperateCount = 0;
//    for (int i = 0; i < s.length() - 1; i++) {
//      if (s.charAt(i) != s.charAt(i + 1)) {
//        seperateCount++;
//      }
//    }
//    int result = 0;
//    if (seperateCount == 0) {
//      System.out.println(result);
//      return;
//    }
//    if (seperateCount % 2 != 0) {
//      result = seperateCount / 2 + 1;
//    } else {
//      result = seperateCount / 2;
//    }
//    System.out.println(result);

  }

}
