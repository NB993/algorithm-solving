package nadongbin.part2.graph_theory;

import java.util.ArrayList;
import java.util.List;

public class Topology {

    // 노드의 개수(V)와 간선의 개수(E)
    // 노드의 개수는 최대 100,000개라고 가정
    public static int v, e;
    // 모든 노드에 대한 진입차수는 0으로 초기화
    public static int[] indegree = new int[100001];
    // 각 노드에 연결된 간선 정보를 담기 위한 연결 리스트 초기화
    public static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {

    }

}
