package nadongbin.part2.greedy;

import java.util.Scanner;

public class Greedy_4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int k = sc.nextInt();

    int n = 26;
    int k = 3;
    int count = 0;

    while (n != 1) {
      if (n % k == 0) {
        n /= k;
      } else {
        n -= 1;
      }
      count++;
    }

    System.out.println(count);
  }

}
