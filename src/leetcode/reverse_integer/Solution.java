package leetcode.reverse_integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
    System.out.println(reverse(-123));
  }
  public static int reverse(int x) {
    String plusMinusSign = "";
    String str = Integer.toString(x);
    String[] strArr;

    if (str.contains("-")) {
      plusMinusSign = str.substring(0, 1);
      str = str.substring(1);
    }
    if (str.lastIndexOf("0") == str.length() - 1) {
      str = str.substring(0, str.length() - 1);
    }

    List<String> strs = Arrays.asList(str.split(""));
    Collections.reverse(strs);

    StringBuilder sb = new StringBuilder();
    for (String s : strs) {
      sb.append(s);
    }

    String returnStr = plusMinusSign + sb.toString();
    if (returnStr.equals("")) {
      return 0;
    }
    if (Long.parseLong(returnStr) < (int) Math.pow(-2, 31) ||
        (int) Math.pow(2, 32) - 1 < Long.parseLong(returnStr)) {
      return 0;
    }

    return Integer.parseInt(returnStr);
  }

}
