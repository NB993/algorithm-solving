package beakjoon.basic;

import java.io.*;

public class Main3052 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[42];

    String strN = "";
    while ((strN = br.readLine()) != null) {
      arr[Integer.parseInt(strN) % 42]++;
    }

    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        count++;
      }
    }
    System.out.println(count);
  }
}
