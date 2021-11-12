package programmers.lvl1.모의고사;

import java.util.*;

public class Solution {
  public static int[] solution(int[] answers) {
    int[] answer = {};
//    int[] answers2 = {1,5,3,2,4,1,6,4,5,3,3,1,1,2,3,4,6,3,4,1,1,1,2,3,4,4,5,3,2,1,3,1};
    int[] member1 = {1, 2, 3, 4, 5};
    int[] member2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] member3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};


    int member1Count = rigthAnswerCheck(member1, answers, 0, 0);
    int member2Count = rigthAnswerCheck(member2, answers, 0, 0);
    int member3Count = rigthAnswerCheck(member3, answers, 0, 0);

    System.out.println(member1Count);
    System.out.println(member2Count);
    System.out.println(member3Count);

    return answer;

    Arrays.stream(member1).
  }

  public static int rigthAnswerCheck(int[] memberArr, int[] answers, int startCount, int rightAnswerCount) {
    int count = rightAnswerCount;
    int nextStartCount = startCount + memberArr.length;

    for (int i = startCount; i < answers.length; i++) {
      if (memberArr[i - startCount] == answers[i]) {
        count++;
      }
      if ((i + 1) % memberArr.length == 0) {
        return rigthAnswerCheck(memberArr, answers, nextStartCount, count);
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int[] answers2 = {1,5,3,2,4,1,6,4,5,3,3,1,1,2,3,4,6,3,4,1,1,1,2,3,4,4,5,3,2,1,3,1};
    solution(answers2);
  }
}
