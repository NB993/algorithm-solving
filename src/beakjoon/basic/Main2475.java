package beakjoon.basic;

import java.util.Scanner;

public class Main2475 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int lastNum = 0;
    int num;

    for (int i=0; i < 5; i++) {
      num = sc.nextInt();
      lastNum += num * num;
    }

    System.out.println(lastNum % 10);
  }
}
