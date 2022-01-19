package programmers.lvl1.모의고사;

import java.util.*;

class Solution {

    public int[] solution(int[] answers) { //answers : 정답이 든 배열
        int[] temp = new int[3]; //가장 많이 맞춘 사람 담는 배열

        int[] supo1 = new int[]{1, 2, 3, 4, 5};
        int[] supo2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int leng1 = supo1.length;
        int leng2 = supo2.length;
        int leng3 = supo3.length;

        for (int i = 0; i < answers.length; i++) {
            if (supo1[i % supo1.length] == answers[i]) {
                temp[0]++;
            }
            if (supo2[i % supo2.length] == answers[i]) {
                temp[1]++;
            }
            if (supo3[i % supo3.length] == answers[i]) {
                temp[2]++;
            }
        }

        List<Integer> list = new ArrayList<>();
        int max = Math.max(Math.max(temp[0], temp[1]), temp[2]);

        if (max == temp[0]) {
            list.add(1);
        }
        if (max == temp[1]) {
            list.add(2);
        }
        if (max == temp[2]) {
            list.add(3);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

//public class Solution {
//  public static int[] solution(int[] answers) {
//    int[] answer = {};
////    int[] answers2 = {1,5,3,2,4,1,6,4,5,3,3,1,1,2,3,4,6,3,4,1,1,1,2,3,4,4,5,3,2,1,3,1};
//    int[] member1 = {1, 2, 3, 4, 5};
//    int[] member2 = {2, 1, 2, 3, 2, 4, 2, 5};
//    int[] member3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//
//
//    int member1Count = rigthAnswerCheck(member1, answers, 0, 0);
//    int member2Count = rigthAnswerCheck(member2, answers, 0, 0);
//    int member3Count = rigthAnswerCheck(member3, answers, 0, 0);
//
//    System.out.println(member1Count);
//    System.out.println(member2Count);
//    System.out.println(member3Count);
//
//    return answer;
//  }
//
//  public static int rigthAnswerCheck(int[] memberArr, int[] answers, int startCount, int rightAnswerCount) {
//    int count = rightAnswerCount;
//    int nextStartCount = startCount + memberArr.length;
//
//    for (int i = startCount; i < answers.length; i++) {
//      if (memberArr[i - startCount] == answers[i]) {
//        count++;
//      }
//      if ((i + 1) % memberArr.length == 0) {
//        return rigthAnswerCheck(memberArr, answers, nextStartCount, count);
//      }
//    }
//
//    return count;
//  }
//
//  public static void main(String[] args) {
//    int[] answers2 = {1,5,3,2,4,1,6,4,5,3,3,1,1,2,3,4,6,3,4,1,1,1,2,3,4,4,5,3,2,1,3,1};
//    solution(answers2);
//  }
//}
