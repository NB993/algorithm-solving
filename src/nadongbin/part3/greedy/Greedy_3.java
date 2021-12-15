package nadongbin.part3.greedy;

import java.util.Scanner;

public class Greedy_3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    String s = sc.nextLine();

    String s = "0101010101";
    int seperateCount = 0;
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) != s.charAt(i + 1)) {
        seperateCount++;
      }
    }
    int result = 0;
    if (seperateCount == 0) {
      System.out.println(result);
      return;
    }
    if (seperateCount % 2 != 0) {
      result = seperateCount / 2 + 1;
    } else {
      result = seperateCount / 2;
    }
    System.out.println(result);


  }

}
