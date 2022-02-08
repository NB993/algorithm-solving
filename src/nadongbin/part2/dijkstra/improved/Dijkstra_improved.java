package nadongbin.part2.dijkstra.improved;
import java.util.*;

class Node implements Comparable<Node> {

    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return this.index;
    }

    public int getDistance() {
        return this.distance;
    }

    // 거리(비용)가 짧은 것이 높은 우선순위를 가지도록 설정
    @Override
    public int compareTo(Node other) {
        if (this.distance < other.distance) {
            return -1;
        }
        return 1;
    }
}

public class Dijkstra_improved {

    public static final int INF = (int) 1e9; // 무한을 의미하는 값으로 10억을 설정
    // 노드의 개수(N), 간선의 개수(M), 시작 노드 번호(Start)
    // 노드의 개수는 최대 100,000개라고 가정
    public static int n, m, start;
    // 각 노드에 연결되어 있는 노드에 대한 정보를 담는 배열
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    // 최단 거리 테이블 만들기
    public static int[] d = new int[100001];

    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        // 시작 노드로 가기 위한 최단 경로는 0으로 설정하여, 큐에 삽입
        pq.offer(new Node(start, 0));
        d[start] = 0;

        //Todo
        // 우선순위 큐에서 노드를 꺼내서 검사하는 while문은 노드의 개수 V이상으로는 반복되지 않는다.
        while(!pq.isEmpty()) { // 큐가 비어있지 않다면
            // 가장 최단 거리가 짧은 노드에 대한 정보 꺼내기
            Node node = pq.poll();
            int dist = node.getDistance(); // 현재 노드까지의 비용
            int now = node.getIndex(); // 현재 노드
            // 현재 노드가 이미 처리된 적이 있는 노드라면 무시
            if (d[now] < dist) continue;
            // 현재 노드와 연결된 다른 인접한 노드들을 확인
            for (int i = 0; i < graph.get(now).size(); i++) {
                int cost = d[now] + graph.get(now).get(i).getDistance();
                // 현재 노드를 거쳐서, 다른 노드로 이동하는 거리가 더 짧은 경우
                if (cost < d[graph.get(now).get(i).getIndex()]) {
                    d[graph.get(now).get(i).getIndex()] = cost; //갱신
                    pq.offer(new Node(graph.get(now).get(i).getIndex(), cost)); //현재 노드를 거쳐갔을 때 비용이 적어지는 인접노드를 우선순위 큐에 넣는다.

                    //Todo
                    // 현재 노드의 인접 노드 중 현재 노드를 거쳐가면 기존 (인접 노드 번호의)최단거리 테이블 비용보다
                    // cost가 더 낮은 노드가 있다면 해당 인접 노드를 우선순위 큐에 넣는다 -> 넣을 때마다 우선순위 큐가 Node에 정의된
                    // compareTo에 따라서 거리가 제일 짧은 노드를 맨 앞으로 정렬해놓는다. 그러면 50번 line에서
                    // 제일 거리가 짧은 노드를 뽑아낸 후, 그 노드에서 인접 노드까지의 거리가 최단거리 테이블에 기록된 비용보다 크다면
                    // 이미 그 노드는 처리가 끝난                                                          (처리가 끝났다는 표현이 좀 와닿지 않는데, 더 이상 비용을 줄일 수 없는 노드라고 표현해도 될지?)
                    // 노드이므로 넘어가고, 그렇지 않다면 다시 해당 노드로부터 또 for문을 돌며 인접노드 중 현재 뽑혀나온
                    // 노드를 거쳐가면 비용이 더 적어지는 노드가 있는지를 찾아내어 우선순위 큐에 넣는 과정을 반복한다.
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Node>());
        }

        // 모든 간선 정보를 입력받기
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            // a번 노드에서 b번 노드로 가는 비용이 c라는 의미
            graph.get(a).add(new Node(b, c));
        }

        // 최단 거리 테이블을 모두 무한으로 초기화
        Arrays.fill(d, INF);

        // 다익스트라 알고리즘을 수행
        dijkstra(start);

        // 모든 노드로 가기 위한 최단 거리를 출력
        for (int i = 1; i <= n; i++) {
            // 도달할 수 없는 경우, 무한(INFINITY)이라고 출력
            if (d[i] == INF) {
                System.out.println("INFINITY");
            }
            // 도달할 수 있는 경우 거리를 출력
            else {
                System.out.println(d[i]);
            }
        }
    }
}
