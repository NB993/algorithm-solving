package nadongbin.part3.greedy;

import java.util.Scanner;

public class Greedy_2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] numArr = sc.nextLine().split("");

//    String[] numArr = {"5", "6", "7"};

    int result = 0;
    int currentNumber = 0;
    for (int i = 0; i < numArr.length; i++) {
      currentNumber = Integer.parseInt(numArr[i]);
      if (currentNumber == 0 || currentNumber == 1 || result == 0) {
        result += currentNumber;
      } else {
        result *= currentNumber;
      }
    }
    System.out.println(result);

  }

}
