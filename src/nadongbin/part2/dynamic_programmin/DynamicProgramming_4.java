package nadongbin.part2.dynamic_programmin;

public class DynamicProgramming_4 {

    public static void main(String[] args) {
        int n = 10;

        int[] d = new int[1000];
        //경우의 수가 규칙적
        //가로 길이 1칸일 떄 : 1
        //가로 길이 2칸일 떄 : 3
        //가로 길이 3칸일 떄 : 5
        // 위 세 경우를 반복하는 것이므로 인덱스는 %를 이용하면 될듯

        d[0] = 0;
        d[1] = 1;
        d[2] = 3;

        for (int i = 3; i <= n; i++) {
            d[i] = (d[i - 1] * 1 + d[i - 2] * 2) % 796796;
        }
        System.out.println(d[n]);

    }

}
