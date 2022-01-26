package nadongbin.part2.dynamic_programmin;

public class DynamicProgramming_4 {

    public static void main(String[] args) {
        int n = 10;

        int[] d = new int[1000];
        //가로 길이 1칸일 떄 : 1
        //가로 길이 2칸일 떄 : 3

        d[0] = 0;
        d[1] = 1;
        d[2] = 3;

        for (int i = 3; i <= n; i++) {
            d[i] = (d[i - 1] * 1 + d[i - 2] * 2) % 796796;
        }
        System.out.println(d[n]);

    }

}
