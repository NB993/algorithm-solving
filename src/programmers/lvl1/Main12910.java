package programmers.lvl1;

import java.util.*;

public class Main12910 {

  public static void main(String[] args) {

  }

  public int[] solution(int[] arr, int divisor) {
    int[] answer = {};
    List<Integer> answerList = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % divisor == 0) {
        answerList.add(arr[i]);
      }
    }

    Collections.sort(answerList);
    answer = new int[answerList.size()];
    for (int i = 0; i < answerList.size(); i++) {
      answer[i] = answerList.get(i);
    }

    if (answer.length == 0) {
      answer = new int[]{-1};
    }

    return answer;

    //다른 사람 코드
//    int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
//    if(answer.length == 0) answer = new int[] {-1};
//    java.util.Arrays.sort(answer);
//    return answer;

  }
}
