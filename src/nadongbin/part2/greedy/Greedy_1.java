package nadongbin.part2.greedy;

public class Greedy_1 {

  public static void main(String[] args) {
    System.out.println(getMinimumCoinCount());
  }

  public static int getMinimumCoinCount() {
    // 거슬러줘야 할 동전의 '최소 개수'를 구하라
    // 거슬러 줄 돈 N은 항상 10의 배수
    int n = 23770;
    int[] coins = new int[]{500, 100, 50, 10};

    int currentCoin = 0;
    int coinCount = 0;
    while (n != 0) {
      coinCount += (int) n / coins[currentCoin];
      n = n % coins[currentCoin];
      currentCoin++;
    }

    return coinCount;
  }
}
