package nadongbin.part2.dijkstra.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Node {

    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index; //노드 번호
        this.distance = distance; //이 노드까지의 거리(비용) <- 노드마다 이 노드까지의 거리가 다르기 때문에 ArrayList를 중첩해서 노드정보를 가지고 있는 것.
    }

    public int getIndex() {
        return this.index;
    }

    public int getDistance() {
        return this.distance;
    }

}

public class Dijkstra_simple {

    public static final int INF = (int) 1e9; //10억(무한값 세팅)
    public static int n; //노드의 개수
    public static int m; //간선의 개수
    public static int start; //시작 노드 번호

    //각 노드에 연결되어 있는 노드에 대한 정보를 담는 배열
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    //방문한 적이 있는지 체크하는 목적의 배열 만들기
    public static boolean[] visited = new boolean[100001];
    //최단 거리 테이블 만들기
    public static int[] d = new int[100001];

    //방문하지 않은 노드 중에서, 가장 최단 거리가 짧은 노드의 번호를 반환
    public static int getSmallestNode() {
        int min_value = INF;
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (d[i] < min_value && !visited[i]) {
                min_value = d[i];
                index = i;
            }
        }
        return index;
    }

    public static void dijkstra(int start) {
        //시작 노드에 대해서 초기화
        d[start] = 0;
        visited[start] = true;
        for (int j = 0; j < graph.get(start).size(); j++) { //시작노드의 인접노드의 거리(비용)값을 구해서 최단거리 테이블에 저장
            d[graph.get(start).get(j).getIndex()] = graph.get(start).get(j).getDistance(); //index는 시작 노드에서 이동할 수 있는 인접한 노드의 번호
        }
        //시작 노드를 제외한 전체 n-1개의 노드에 대해서 반복
        for (int i = 0; i < n - 1; i++) {
            //현재 최단 거리가 가장 짧은 노드를 꺼내서, 방문 처리
            int now = getSmallestNode(); //최단거리 테이블을 순회하며 현재 최단 거리인 노드 번호를 리턴함.
            visited[now] = true; //최단거리 노드에 방문 처리 하고,
            //현재 노드(최단 거리 노드)와 연결된 다른 노드를 확인 -> 뭐를? 현재 노드를 거쳐서 인접 노드로 가는 비용이 최단거리 테이블에 기록된 비용보다 더 낮은지를
            for (int j = 0; j < graph.get(now).size(); j++) {
                int cost = d[now] + graph.get(now).get(j).getDistance(); // d[now](현재 노드까지의 거리) + 인접한 노드까지의 거리
                if (cost < d[graph.get(now).get(j).getIndex()]) { //즉 인접한 노드에 현재 노드를 거쳐 갈 때의 이동거리가, 기존 최단 거리테이블에 저장된 인접 노드의 최단거리보다 짧은 경우
                    d[graph.get(now).get(j).getIndex()] = cost; //현재 노드를 거쳐가는 값으로 최단거리 테이블을 갱신시켜준다
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); //노드개수
        m = sc.nextInt(); //간선 개수
        start = sc.nextInt(); //시작 노드번호

        // 그래프 초기화 -> 노드 개수만큼 그래프에 arrayList를 담는다.
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
