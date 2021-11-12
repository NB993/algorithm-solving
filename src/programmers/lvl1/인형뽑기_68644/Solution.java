package programmers.lvl1.인형뽑기_68644;

import java.util.*;

public class Solution {

  public static int solution(int[][] board, int[] moves) {
    int answer = 0;

    List<Integer> basket = new ArrayList<>();
    int boardLength = board[0].length;

    for (int i = 0; i < moves.length; i++) {
      for (int j = 0; j < boardLength; j++) {
        //아래 for문 하나 줄이자.
        for (int k = 0; k < basket.size() - 1; k++) {
          if (basket.get(k) == basket.get(k + 1)) {
            basket.remove(k);
            basket.remove(k);
            answer += 2;
            k = 0;
          }
        }

        if (board[j][moves[i] - 1] != 0) {
          basket.add(board[j][moves[i] - 1]);
          board[j][moves[i] - 1] = 0;
          break;
        }
      }
    }

    return answer;
  }
}
