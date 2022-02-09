package nadongbin.part2.graph_theory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Edge implements Comparable<Edge> {

    private int distance;
    private int nodeA;
    private int nodeB;

    public Edge(int distance, int nodeA, int nodeB) {
        this.distance = distance;
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getNodeA() {
        return this.nodeA;
    }

    public int getNodeB() {
        return this.nodeB;
    }

    @Override
    public int compareTo(Edge other) {
        if (this.distance < other.distance) {
            return -1;
        }
        return 1;
    }
}

public class Ex_3 {

    private static int[] parent = new int[100001];
    private static int n;
    private static int m;
    private static List<Edge> edges = new ArrayList<>();
    private static int result = 0;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 노드(마을) 개수
        m = sc.nextInt(); // 간선(마을을 연결하는 길)의 개수

        // 부모 테이블 초기화
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        //모든 간선에 대한 정보 입력 받기
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cost = sc.nextInt();
            edges.add(new Edge(cost, a, b));
        }

        // 간선을 비용순 정렬
        Collections.sort(edges);

        Edge edge = null;
        for (int i = 0; i < edges.size(); i++) {
            edge = edges.get(i);
            int cost = edge.getDistance();
            int a = edge.getNodeA();
            int b = edge.getNodeB();

            if (findParent(a) != findParent(b)) {
                unionParent(a, b);
                result += cost;
            }
        }

    }

    private static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);

        if (a < b) {
            parent[b] = a;
        } else {
           parent[b] = a;
        }
    }

    private static int findParent(int x) {
        if (x == parent[x]) {
            return x;
        }
        return parent[x] = findParent(parent[x]);
    }

}
