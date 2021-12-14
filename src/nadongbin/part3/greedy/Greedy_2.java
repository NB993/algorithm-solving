package nadongbin.part3.greedy;

import java.util.Scanner;

public class Greedy_2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    // split할 필요 없이 그냥 char배열처럼 사용해버리기.
    // '0'의 아스키코드 값이 48이고 '9'까지 아스키코드 값이 1씩 증가하므로 결국 아래 코드는
    // 문자열 숫자와 동일한 int/long 값을 리턴할 수 있음.
    long result = str.charAt(0) - '0'; //첫문자를 일단 숫자로 바꿔서 저장해놓고,

    //두 번째 숫자부터 반복문 수행.
    for (int i = 1; i < str.length(); i++) {
      int num = str.charAt(i) - '0';
      if (num <= 1 || result <= 1) {
        result += num;
      } else {
        result *= num;
      }
    }

    System.out.println(result);
  }

}
