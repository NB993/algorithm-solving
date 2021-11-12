package programmers.lvl1.요일계산;

public class Solution {
  public String solution(int a, int b) {
    String answer = "";

    int[] remainder = {3, 1, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
    int remainDaySum = 0;

    for (int i = 0; i < a - 1; i++) {
      remainDaySum += remainder[i];
    }
    remainDaySum += b;

    if (remainDaySum % 7 == 0) {
      answer = "THU";
    } else if (remainDaySum % 7 == 1) {
      answer = "FRI";
    } else if (remainDaySum % 7 == 2){
      answer = "SAT";
    } else if (remainDaySum % 7 == 3){
      answer = "SUN";
    } else if (remainDaySum % 7 == 4){
      answer = "MON";
    } else if (remainDaySum % 7 == 5){
      answer = "TUE";
    } else if (remainDaySum % 7 == 6){
      answer = "WED";
    }

    return answer;

  }
}
