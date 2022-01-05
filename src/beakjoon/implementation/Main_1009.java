package beakjoon.implementation;

import java.io.*;
import java.util.*;

public class Main_1009 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    StringTokenizer st = null;
    int base = 0;
    int exponent = 0;
    int mod = 1;
    List<Boolean> exponentBinary = null;

    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      base = Integer.parseInt(st.nextToken());
      exponent = Integer.parseInt(st.nextToken());
      exponentBinary = getBinary(exponent);

      for (int j = exponentBinary.size() - 1; j >= 0; j--) {
        mod = (mod * mod) % 10;
        if (exponentBinary.get(j)) {
          mod = (mod * base) % 10;
        }
      }
      if (mod == 0) {
        System.out.println(10);
      } else {
        System.out.println(mod);
      }
      mod = 1;
    }
  }

  public static List<Boolean> getBinary(int decimal) {
    List<Boolean> resultBinary = new ArrayList<>();
    int remainder = 0;
    while (decimal / 2 > 0) {
      remainder = decimal - (decimal / 2) * 2;
      resultBinary.add(remainder != 0);
      decimal /= 2;
    }
    resultBinary.add(true); //마지막 몫 1
    return resultBinary;
  }
}
