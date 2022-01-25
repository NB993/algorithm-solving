package nadongbin.part2.dynamic_programmin;

public class DynamicProgramming_2 {

    public static void main(String[] args) {
        int x = 26; // 1 <= X <= 30,000

        int[] dp = new int[30001];

        for (int i = 2; i <= x; i++) { //값은 3만까지 나올 수 있는데 계산상 편의를 위해 0번 인덱스는 버리는 듯함?
            //경우의 수 네 가지를 모두 값을 가져온 다음, 제일 작은 것을 담음.
            dp[i] = dp[i - 1] + 1; // -1
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 2로 나누어 떨어지는 경우
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 3로 나누어 떨어지는 경우
            if (i % 5 == 0) dp[i] = Math.min(dp[i], dp[i / 5] + 1); // 5로 나누어 떨어지는 경우

        }
        System.out.println(dp[x]);

    }




}
