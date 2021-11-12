package programmers.lvl1.약수의_합_12928;

public class Solution {
  public int solution(int n) {
    int answer = 0;

    for (int i = 0; i < n; i++) {
      if (n % (i + 1) == 0) {
        answer += (i + 1) + (n / (i + 1));
      }
    }

    return answer / 2;
  }
}
