package nadongbin.part2.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Implementation_2 {

  public static void main(String[] args) throws IOException {

    //해답
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String point = br.readLine();
    int row = point.charAt(1) - '0';
    int column = point.charAt(0) - 'a' + 1;

    // 이동할 수 있는 8가지 방향을 모두 정의 해놓는다
    int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

    // 이동할 수 있는 방향을 모두 이동해보며 이동이 가능한지 확인한다
    int result = 0;
    for (int i = 0; i < 8; i++) {
      // 이동 위치값 생성
      int nextRow = row + dx[i];
      int nextColumn = column + dy[i];
      // 해당 위치로 이동이 가능하다면 카운트 증가
      if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
        result += 1;
      }
    }

    System.out.println(result);

    // 내 풀이 문제점 : 이동가능한지를 판단하는 분기문은 위 하나로 끝낼 수 있는데,
    // 이동할 수 없는 경우의 수를 따지려면 분기문이 지저분하게 늘어난다. 그러다보니 놓친 케이스가 있어서 아래 코드로는 정답도 못맞춤.
    // 문제점과 별개로 문제 풀이법은 잘 써먹을 수 있을 것 같다.
    
    //내 풀이
//    int horizontalMin = 'c';
//    int verticalMin = 3;
//    int horizontalMax = 'f';
//    int verticalMax = 6;
//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////    String[] place = br.readLine().split("");
//    String[] place = {"e", "8"};
//    int horizontal = place[0].charAt(0);
//    int vertical = Integer.parseInt(place[1]);
//
//
//
//    int possibleCount = 8;
//    if (horizontal <= horizontalMin || horizontal >= horizontalMax) {
//      if (horizontalMin - horizontal == 2) possibleCount--;
//      if (horizontal - horizontalMax == 2) possibleCount--;
//      possibleCount -= 2;
//    }
//    if (vertical <= verticalMin || vertical >= verticalMax) {
//      if (verticalMin - vertical == 2) possibleCount--;
//      if (vertical - verticalMax == 2) possibleCount--;
//      possibleCount -= 2;
//    }
//
//    System.out.println(possibleCount);
  }

}
