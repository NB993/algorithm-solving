package beakjoon.implementation;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main_1076 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Map<String, String> colorMap = new HashMap<>();
    System.out.println((int)Math.pow(10, Double.parseDouble("0")));
    colorMap.put("black", "0");
    colorMap.put("brown", "1");
    colorMap.put("red", "2");
    colorMap.put("orange", "3");
    colorMap.put("yellow", "4");
    colorMap.put("green", "5");
    colorMap.put("blue", "6");
    colorMap.put("violet", "7");
    colorMap.put("grey", "8");
    colorMap.put("white", "9");

    String firstColor = colorMap.get("black");
    String secondColor = colorMap.get("yellow");
    String thirdColor = colorMap.get("red");

//    String firstColor = colorMap.get(br.readLine());
    firstColor = firstColor == "0" ? "" : firstColor;
    secondColor = secondColor == "0" ? "" : secondColor;
//    String secondColor = colorMap.get(br.readLine());
//    String thirdColor = colorMap.get(br.readLine());
    
    System.out.println(
        Integer.parseInt(firstColor + secondColor)
            * (int)Math.pow(10, Double.parseDouble(thirdColor))
    );
  }
}
