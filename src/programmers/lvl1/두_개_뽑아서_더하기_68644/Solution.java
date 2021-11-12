package programmers.lvl1.두_개_뽑아서_더하기_68644;

import java.util.*;

public class Solution {

  public int[] solution(int[] numbers) {
    int[] answer = {};

    //TreeSet은 자동정렬
    Set<Integer> numberSet = new TreeSet<>();

    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        numberSet.add(numbers[i] + numbers[j]);
      }
    }

    answer = new int[numberSet.size()];
    int i = 0;
    Iterator iterator = numberSet.iterator();
    while (iterator.hasNext()) {
      answer[i++] = (int)iterator.next();
    }


    return answer;
  }

}
