package leetcode.palindrome_number;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
    isPalindrome(1001);
  }

  public static boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    int numLength = Integer.toString(x).length();
    int divideNum = (int) Math.pow(10, numLength / 2);

    String front = "";
    String rear = "";
    int frontInt = 0;
    int rearInt = 0;

    if (numLength % 2 == 0) {
      frontInt = x / divideNum;
      rearInt = x % divideNum;
      front = Integer.toString(frontInt);
      rear = Integer.toString(rearInt);
      if (rear.length() < numLength / 2) {
        rear = "0".repeat((numLength / 2) - rear.length()) + rear;
      }
    }
    if (numLength % 2 == 1) {
      frontInt = x / (divideNum * 10);
      rearInt = x % divideNum;
      front = Integer.toString(frontInt);
      rear = Integer.toString(rearInt);
      if (rear.length() < numLength / 2) {
        rear = "0".repeat((numLength / 2) - rear.length()) + rear;
      }
    }

    List<String> rearList = Arrays.asList(rear.split(""));
    Collections.reverse(rearList);
    String lastRear = String.join("", rearList);
    System.out.println(lastRear);

    return front.equals(lastRear);
  }
}
