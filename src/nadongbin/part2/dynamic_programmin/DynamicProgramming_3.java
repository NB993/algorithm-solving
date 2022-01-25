package nadongbin.part2.dynamic_programmin;

public class DynamicProgramming_3 {

    public static void main(String[] args) {
        int n = 4;

        int[] arr = new int[]{1, 3, 1, 5};

        //값이 들어있는 배열과 인덱스를 맞추기 위해서 0번 인덱스부터 시작하려는듯.
        //dp테이블은 앞에서부터 sum된 값이 들어감.
        int[] dp = new int[100];

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }
        System.out.println(dp[n - 1]);
    }

}
