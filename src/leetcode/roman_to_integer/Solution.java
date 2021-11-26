package leetcode.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static int romanToInt(String s) {
    Map<String, Integer> romanNum = new HashMap<>();
    romanNum.put("I", 1);
    romanNum.put("V", 5);
    romanNum.put("X", 10);
    romanNum.put("L", 50);
    romanNum.put("C", 100);
    romanNum.put("D", 500);
    romanNum.put("M", 1000);

    String[] numbers = s.split("");
    int answer = 0;

    String previous = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
      if(romanNum.get(previous) < romanNum.get(numbers[i])) {
        answer -= romanNum.get(previous);
      } else {
        answer += romanNum.get(previous);
      }
      previous = numbers[i];
    }
    answer += romanNum.get(numbers[numbers.length - 1]);

    return answer;
  }

  public static void main(String[] args) {
    romanToInt("MMMCMXCIX");
  }

}
