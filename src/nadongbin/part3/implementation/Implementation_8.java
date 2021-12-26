package nadongbin.part3.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class Implementation_8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split("");
    Arrays.sort(arr);

    int sum = 0;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].charAt(0) - '0' < 10) {
        sum += Integer.parseInt(arr[i]);
      } else {
        sb.append(arr[i]);
      }
    }

    sb.append(Integer.toString(sum));
    System.out.println(sb);

  }

}
