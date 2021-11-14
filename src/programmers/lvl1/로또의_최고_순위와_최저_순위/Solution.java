package programmers.lvl1.로또의_최고_순위와_최저_순위;

import java.util.*;

public class Solution {

  public int[] solution(int[] lottos, int[] win_nums) {
    int[] answer = new int[2];

    Set<Integer> lottoSet = new TreeSet<>();
    for (int i = 0; i < lottos.length; i++) {
      if (lottos[i] != 0) {
        lottoSet.add(lottos[i]);
      }
    }

    List<Integer> winList = new ArrayList<>();
    for (Integer num : win_nums) {
      winList.add(num);
    }


    int preAnswerCount = 0;
    Iterator iterator = lottoSet.iterator();
    while (iterator.hasNext()) {
      int setNum = (int) iterator.next();
      for (int j = 0; j < winList.size(); j++) {
        if (setNum == winList.get(j)) {
          winList.remove(j);
          preAnswerCount++;
        }
      }
    }

    int cantRecogCount = 6 - lottoSet.size();
    int maxRightAnswerCount = 0;
    if (winList.size() < cantRecogCount) {
      maxRightAnswerCount = preAnswerCount + winList.size();
    } else {
      maxRightAnswerCount = preAnswerCount + cantRecogCount;
    }

    if (preAnswerCount > 1) {
      answer[0] = 6 - preAnswerCount + 1;
      answer[1] = 6 - maxRightAnswerCount + 1;
    }
    if (preAnswerCount == 1) {
      answer[0] = 6;
      answer[1] = 6 - maxRightAnswerCount;
    }
    if (preAnswerCount == 0) {
      answer[0] = 6;
      answer[1] = 7 - maxRightAnswerCount;
    }

    Arrays.sort(answer);
    return answer;
  }
}
