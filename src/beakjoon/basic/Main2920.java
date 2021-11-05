package beakjoon.basic;

import java.io.*;
import java.util.*;

public class Main2920 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");

    int minusResult;

    //오름차순 체크
    if (Integer.parseInt(inputs[0]) == 1) {
      for (int i = 0; i < inputs.length - 1; i++) {
        minusResult = Integer.parseInt(inputs[i + 1]) - Integer.parseInt(inputs[i]);

        if (minusResult != 1) {
          System.out.println("mixed");
          return;
        }

      }

      System.out.println("ascending");
      return;
    }


    //내림차순 체크
    if (Integer.parseInt(inputs[0]) == 8) {
      for (int i = 0; i < inputs.length - 1; i++) {
        minusResult = Integer.parseInt(inputs[i]) - Integer.parseInt(inputs[i + 1]);

        if (minusResult != 1) {
          System.out.println("mixed");
          return;
        }
      }

      System.out.println("descending");
      return;
    }

    System.out.println("mixed");
    return;

  }

}
