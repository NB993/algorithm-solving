package programmers.lvl1;

import java.util.*;

public class Main64061 {

  public static void main(String[] args) {
    int answer = 0;
    int n = 5~30까지 랜덤;
    int[][] board = new int[n][n];
    int[] moves = {1 ~ board length까지의 숫자가 랜덤하게 들어있다};

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
