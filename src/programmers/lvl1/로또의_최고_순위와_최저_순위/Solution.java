package programmers.lvl1.로또의_최고_순위와_최저_순위;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {

  //wontae_Jang
  public int[] solution(int[] lottos, int[] win_nums) {
    int[] answer = {0, 0};
    int wcnt = 0;
    int zcnt = 0;

    for (int i : lottos) {
      if (i == 0) {
        zcnt++;
      } else {
        if (IntStream.of(win_nums).anyMatch(x -> x == i)) {
          wcnt++;
        }
      }
    }
    answer[1] = 7 - wcnt > 5 ? 6 : 7 - wcnt;
    answer[0] = 7 - (wcnt + zcnt) > 5 ? 6 : 7 - (wcnt + zcnt);

    return answer;
  }
//  public int[] solution(int[] lottos, int[] win_nums) {
//    int[] answer = new int[2];
//
//    //내 번호중 0이 아닌 것만 담는다.
//    Set<Integer> lottoSet = new TreeSet<>();
//    for (int i = 0; i < lottos.length; i++) {
//      if (lottos[i] != 0) {
//        lottoSet.add(lottos[i]);
//      }
//    }
//
//    //정답을 일단 List로 변환
//    List<Integer> winList = new ArrayList<>();
//    for (Integer num : win_nums) {
//      winList.add(num);
//    }
//
//
//    //정답 최대 카운트를 계산하기 전에 내 번호가
//    //실제로 몇 개 맞는지 세본다.
//    int preAnswerCount = 0;
//    int setNum = 0;
//    Iterator iterator = lottoSet.iterator();
//    while (iterator.hasNext()) {
//      setNum = (int) iterator.next();
//      //내 번호 하나를 뽑아서, 실제 정답 리스트를 돌며 비교한다.
//      for (int j = 0; j < winList.size(); j++) {
//        //만약 정답이라면 정답 리스트에서 맞춘 정답은 삭제한다.
//        if (setNum == (int) winList.get(j)) {
//          winList.remove(j);
//          preAnswerCount++;
//        }
//      }
//    }
//
//    //내 번호 중에서 못 알아볼 번호의 개수를 구한다음
//    int cantRecogCount = 6 - lottoSet.size();
//    int maxRightAnswerCount = 0;
//    //남아있는 정답 개수와 못 알아볼 번호의 개수를 비교해서
//    //만약 못 알아볼 번호 개수가 남아있는 정답 개수보다 크다면
//    if (winList.size() < cantRecogCount) {
//      //더 맞출 수 있는 개수는 '남아있는 정답 개수'뿐이다.
//      maxRightAnswerCount = preAnswerCount + winList.size();
//    } else {
//      //만약 못 알아볼 번호 개수가 정답 개수보다 작거나 정답 개수와 같다면
//      //더 맞출 수 있는 개수는 '못 알아볼 번호 개수'이다.
//      maxRightAnswerCount = preAnswerCount + cantRecogCount;
//    }
//
//    //그럼 이제 최고등수를 구해보자.
//    //만약 못 알아볼 숫자 빼고 2개 이상 맞췄다면
//    if (preAnswerCount > 1) {
//      //최소 등수는 1등부터 5등까지 될 수 있고
//      answer[0] = 6 - preAnswerCount + 1;
//      //최고등수는 6 - 최대로 맞출 수 있는 개수 + 1이다.
//      answer[1] = 6 - maxRightAnswerCount + 1;
//    }
//    //만약 못 알아볼 숫자 빼고 하나 맞췄다면
//    if (preAnswerCount == 1) {
//      //일단 최소 꼴등이고,
//      answer[0] = 6;
//      //최대로 맞출 수 있는 개수도 하나였다면(=못 알아볼 숫자가 없는데도 하나만 맞춘 경우)
//      if (maxRightAnswerCount == 1) {
//        //최고 등수도 꼴등이다
//        answer[1] = 6;
//        //최대로 맞출 수 있는 개수가 2개 이상이었다면
//      } else {
//        //최고등수는 6 - 최대로 맞출 수 있는 개수 + 1이다.
//        answer[1] = 6 - maxRightAnswerCount + 1;
//      }
//
//    }
//    //하나도 못맞췄으면
//    if (preAnswerCount == 0) {
//      //최소 꼴등이고,
//      answer[0] = 6;
//      //최대로 맞출 수 있는 개수도 0이라면(= 못 알아볼 숫자도 없는데 다 틀렸다면)
//      if (maxRightAnswerCount == 0) {
//        //최고 등수도 꼴등이다.
//        answer[1] = 6;
//        //근데 더 맞출 수 있는 개수가 있다면
//      } else {
//        //맞춘 개수에 따라 1등부터 꼴등까지 모두 가능하다.
//        answer[1] = 7 - maxRightAnswerCount;
//      }
//
//    }
//
//    Arrays.sort(answer);
//    return answer;
//  }
}
