package nadongbin.part3.implementation;

import java.util.Scanner;

public class Implementation_7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    String N = sc.nextLine();
    String N = "123402";
    String frontNum = N.substring(0, N.length() / 2);
    String rearNum = N.substring(N.length() / 2);

    int frontSum = 0;
    int rearSum = 0;
    for (int i = 0; i < N.length() / 2; i++) {
      frontSum += frontNum.charAt(i) - '0';
      rearSum += rearNum.charAt(i) - '0';
    }

    if (frontSum == rearSum) {
      System.out.println("LUCKY");
    } else {
      System.out.println("READY");
    }



  }

}
