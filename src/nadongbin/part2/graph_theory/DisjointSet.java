package nadongbin.part2.graph_theory;

import java.util.Scanner;

public class DisjointSet {

    // 노드의 개수(V)와 간선(Union 연산)의 개수(E)
    // 노드의 개수는 최대 100,000개라고 가정
    public static int v, e;
    public static int[] parent = new int[100001]; //부모 테이블 초기화

    // 특정 원소가 속한 집합을 찾기
    public static int findParent(int x) {
        // 루트 노드가 아니라면, 루트 노드를 찾을 때까지 재귀적으로 호출
        if (x == parent[x]) return x; //한 집합의 최종 부모 노드는 부모 테이블 값이 자기 자신인 노드임.
        return findParent(parent[x]); //부모 테이블 값이 자기 자신이 아니라면 부모 노드로 아직 거슬러 올라갈 수 있는 거니까 재귀 호출.
    }

    // Todo [압축 경로] findParent()
    public static int findParent2(int x) {
        // 루트 노드가 아니라면, 루트 노드를 찾을 때까지 재귀적으로 호출
        if (x == parent[x]) return x; //한 집합의 최종 부모 노드는 부모 테이블 값이 자기 자신인 노드임.

        //Todo [압축 경로]
        // 부모 노드를 찾으면서 부모 테이블의 자기 인덱스에 최종 부모 노드의 번호를 덮어씌움
        // -> 자신을 부모 노드로 바라보고 있는 노드가 나를 타고 findParent할 때 거슬러 올라갈 경로를 압축해서
        // 곧장 부모 노드로 찾아갈 수 있게 해줌.
        return parent[x] = findParent2(parent[x]);
    }

    // 두 원소가 속한 집합을 합치기
    public static void unionParent(int a, int b) {
        a = findParent(a); //노드 자신의 부모 노드를 찾아 거슬러 올라감.
        b = findParent(b);
        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        v = sc.nextInt();
        e = sc.nextInt();

        // 부모 테이블 초기화 -> 자기 자신을 부모로 설정
        for (int i = 1; i <= v; i++) {
            parent[i] = i;
        }

        // Union 연산을 각각 수행
        for (int i = 0; i < e; i++) {// e: 간선의 개수(두 노드 쌍의 개수)
            int a = sc.nextInt();
            int b = sc.nextInt();
            unionParent(a, b); //두 노드 중에서 부모 노드를 판별함
        }


        // 각 원소가 속한 집합 출력용
        System.out.println("각 원소가 속한 집합: ");
        for (int i = 1; i <= v; i++) { // v: 노드의 개수
            System.out.println(findParent(i) + " ");
        }
        System.out.println();

        // 부모 테이블 내용 출력용
        System.out.println("부모 테이블: ");
        for (int i = 1; i <= v; i++) {
            System.out.println(parent[i] + " ");
        }
        System.out.println();

    }

}
