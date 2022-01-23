package nadongbin.part2.dynamic_programmin;

public class Fibonacci_TopDown {

    //메모이제이션을 위한 배열(DP 테이블)
    public static long[] d = new long[100];

    public static void main(String[] args) {
        System.out.println(fibo(50));
    }

    public static long fibo(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        if (d[x] != 0) {
            return d[x];
        }

        d[x] = fibo(x - 1) + fibo(x - 2);
        return d[x];

    }

}
