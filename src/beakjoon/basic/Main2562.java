package beakjoon.basic;

import java.util.*;

public class Main2562 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = sc.nextInt();
    int count = 1;
    int nextNum = 0;

    for (int i = 0; i < 8; i++) {
      if (max < (nextNum = sc.nextInt())) {
        max = nextNum;
        count = i + 2;
      }

    }

    System.out.println(max);
    System.out.println(count);

  }

}
