package beakjoon.basic;

import java.io.*;

public class Main8958 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int count;
    int sum;

    for (int i = 0; i < n; i++) {
      sum = 0;
      count = 0;

      String[] oxArr = br.readLine().split("");

      for (String s : oxArr) {
        if (s.equals("O")) {
          sum += ++count;
        }
        if (s.equals("X")) {
          count = 0;
        }
      }

      System.out.println(sum);
    }

  }

}
