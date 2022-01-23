package nadongbin.part2.dynamic_programmin;

public class Fibonacci_BottomUp {

    public static long[] d = new long[100];

    public static void main(String[] args) {
        //0번 인덱스는 버린다
        d[1] = 1;
        d[2] = 1;
        int n = 50;
        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기


        for (int i = 3; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        System.out.println(d[n]);

        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime) / 1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : " + secDiffTime);
    }
}
