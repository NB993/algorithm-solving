package nadongbin.part2.graph_search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {

  private int x;
  private int y;

  public Node(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}

public class GraphSearch_4 {

  private static int N;
  private static int M;
  private static int[][] map;

  public static int[] dy = {-1, 1, 0, 0};
  public static int[] dx = {0, 0, -1, 1};

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    M = sc.nextInt();
    sc.nextLine();

    map = new int[N][M];

    for (int i = 0; i < map.length; i++) {
      String str = sc.nextLine();
      for (int j = 0; j < map[i].length; j++) {
        map[i][j] = str.charAt(j) - '0';
      }
    }

    System.out.println(bfs(0, 0));

  }

  public static int bfs(int x, int y) {
    //while문 수행을 위해 먼저 출발칸 노드를 만들고 큐에 삽입한다.
    Queue<Node> q = new LinkedList<>();
    q.offer(new Node(x, y));

    while (!q.isEmpty()) {
      //현재 칸의 노드를 큐에서 꺼낸다 -> 이제 큐가 비어있는 상태
      Node node = q.poll();
      x = node.getX();
      y = node.getY();

      //현재 칸의 상하좌우로 인접한 칸을 조사한다.
      for (int i = 0; i < 4; i++) {
        //다음칸
        int nx = x + dx[i];
        int ny = y + dy[i];

        //다음칸이 지도 밖이라면 건너뛴다
        if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
          continue;
        }
        //괴물이 있는 칸이면 건너뛴다
        if (map[ny][nx] == 0) {
          continue; //괴물
        }

        //이동할 수 있는 안전한 칸이면 이동한다 + 이전에 간 적이 없는 칸이므로 이동한다.
        if (map[ny][nx] == 1) {
          //이동할 칸에 이전 칸의 값을 더해준다. 이를 통해 이동한 칸 수를 가지고 다닐 수 있고, 아직 간 적 없는 안전한칸(1)과 구분할 수 있다.
          map[ny][nx] = map[y][x] + 1;
          //큐에 이동할 칸의 노드를 생성해서 삽입한다.
          q.offer(new Node(nx, ny));
        }

      }
    }
    return map[N - 1][M - 1];
  }

}
