package leetcode.reverse_integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
  public int reverse(int x) {

    List<Integer> numbers = new ArrayList<>();
    while (x != 0) {
      numbers.add(x % 10);
      x /= 10;
    }

    long reversedNumber = 0L;
    int exponent = numbers.size() - 1;

    for (Integer num : numbers) {
      if (num == 0) {
        exponent--;
        continue;
      } else {
        reversedNumber += Long.valueOf(num) * (long) Math.pow(10, exponent);
      }
      exponent--;
      System.out.println(reversedNumber);

    }

    if (reversedNumber == 0 || reversedNumber > Integer.MAX_VALUE
        || reversedNumber < Integer.MIN_VALUE) {
      return 0;
    }


    return (int)reversedNumber;



//         String plusMinusSign = "";
//         String str = Integer.toString(x);
//         String[] strArr;

//         if (str.contains("-")) {
//           plusMinusSign = str.substring(0, 1);
//           str = str.substring(1);
//         }
//         if (str.lastIndexOf("0") == str.length() - 1) {
//           str = str.substring(0, str.length() - 1);
//         }

//         List<String> strs = Arrays.asList(str.split(""));
//         Collections.reverse(strs);

//         StringBuilder sb = new StringBuilder();
//         for (String s : strs) {
//           sb.append(s);
//         }

//         String returnStr = plusMinusSign + sb.toString();
//         if (returnStr.equals("")) {
//           return 0;
//         }
//         if (Long.parseLong(returnStr) < (int) Math.pow(-2, 31) ||
//             (int) Math.pow(2, 32) - 1 < Long.parseLong(returnStr)) {
//           return 0;
//         }

//         return Integer.parseInt(returnStr);
  }
}
