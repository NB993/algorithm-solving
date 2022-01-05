package beakjoon.implementation;

import java.io.*;
import java.util.*;

public class Main_1076 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Map<String, Integer> colorMap = new HashMap<>();
    colorMap.put("black", 0);
    colorMap.put("brown", 1);
    colorMap.put("red", 2);
    colorMap.put("orange", 3);
    colorMap.put("yellow", 4);
    colorMap.put("green", 5);
    colorMap.put("blue", 6);
    colorMap.put("violet", 7);
    colorMap.put("grey", 8);
    colorMap.put("white", 9);

    int firstColor = colorMap.get(br.readLine());
    int secondColor = colorMap.get(br.readLine());
    int thirdColor = colorMap.get(br.readLine());

    if (firstColor == 0 && secondColor == 0) {
      System.out.println(0);
      return;
    }

    long result = (long) (10 * firstColor + secondColor)
        * (int) Math.pow(10, (double) thirdColor);
    System.out.println(result);

  }
}
