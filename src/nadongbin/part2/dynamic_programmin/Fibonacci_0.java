package nadongbin.part2.dynamic_programmin;

public class Fibonacci_0 {

    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

        System.out.println(fibo(50));

        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime) / 1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : " + secDiffTime);
    }

    public static int fibo(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        return fibo(x - 1) + fibo(x - 2);
    }

}
