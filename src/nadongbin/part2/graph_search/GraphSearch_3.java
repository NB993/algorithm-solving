package nadongbin.part2.graph_search;

import java.util.Scanner;

public class GraphSearch_3 {
  private static int[][] frame;
  private static int N;
  private static int M;
  // [북 동 남 서]
  private static final int[] dy = {-1, 0, 1, 0};
  private static final int[] dx = {0, 1, 0, -1};

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt(); //세로
    M = sc.nextInt(); //가로
    frame = new int[N][M];
    sc.nextLine(); //버퍼지우기

//    int[][] memory = new int[N][M]; //갔던 칸을 기억하는 배열 <- 얘가 필요없음. 갔던 칸에 그냥 칸막이 값 1을주면 됨.
    for (int i = 0; i < N; i++) {
      String str = sc.nextLine();
      for (int j = 0; j < M; j++) {
//        frame[i][j] = sc.nextInt();
        frame[i][j] = str.charAt(j) - '0';
      }
    }

    int result = 0;
    for (int i = 0; i < frame.length; i++) {
      for (int j = 0; j < frame[i].length; j++) {
        if (dfs(i, j)) {
          result += 1;
        }
      }
    }
  }

  public static boolean dfs(int x, int y) {
    //상하좌우 dfs 재귀호출하다 틀 밖으로 벗어난 경우엔 바로 종료
    if (x < 0 || x >= M || y < 0 || y >= N) {
      return false;
    }

    if (frame[y][x] == 0) { //구멍이 뚫린 부분이면
      //연결된 상하좌우 칸에 대해서도 구멍이 뚫린 칸인지 검사를 수행
      for (int i = 0; i < 4; i++) {
        frame[y][x] = 1; //해당 칸은 방문 처리해서 다시 오지 않도록 함(덕분에 굳이 방문기록을 남길 배열을 따로 안만들어도 됨)
        dfs(x + dx[i], y + dy[i]);
      }
      return true; //main()에서 dfs() 호출한 부분에 true 리턴 -> 얼음 제작 가능 카운트 증가
    }
    return false; //main()에서 dfs() 호출한 부분에 false 리턴 -> 얼음 제작 가능 카운트가 늘지 않음
  }

}
