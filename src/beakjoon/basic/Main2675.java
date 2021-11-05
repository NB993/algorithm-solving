package beakjoon.basic;

import java.io.*;
import java.util.*;

public class Main2675 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int count = 0;

    String[] strArr;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      String[] splitLine = br.readLine().split(" ");
      count = Integer.parseInt(splitLine[0]);
      strArr = splitLine[1].split("");

      for (int j = 0; j < strArr.length; j++) {
        sb.append(strArr[j].repeat(count));
      }

      System.out.println(sb.toString());
      sb.delete(0, sb.length());
    }


  }
}
