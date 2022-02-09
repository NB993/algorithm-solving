package nadongbin.part2.graph_theory;

import java.util.Scanner;

public class Ex_2 {

    private static int[] parent = new int[100001];
    private static int n;
    private static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 노드 개수
        m = sc.nextInt(); // 간선의 개수

        // 부모 테이블 초기화
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        System.out.print("부모 테이블: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(parent[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < m; i++) {
            int oper = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (oper == 0) { //팀 합치기 -> union 연산
                unionParent(a, b);
            } else if (oper == 1) { //같은 팀 여부 확인 -> find 연산
                if (findParent(a) == findParent(b)) {
                    System.out.println("같은 팀 O");
                } else {
                    System.out.println("같은 팀 X");
                }
            }

        }


    }

    private static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);

        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }

    }

    private static int findParent(int x) {

        if (x == parent[x]) {
            return x;
        }

        parent[x] = findParent(parent[x]);

        return parent[x];
    }
}
