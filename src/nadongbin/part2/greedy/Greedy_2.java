package nadongbin.part2.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy_2 {

  public static void main(String[] args) throws IOException {
    //9시 27분 시작
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    String[] input = br.readLine().split("");
//    String

    int[] input = new int[]{5, 8, 3}; //배열의크기 5, 한 숫자 연속 3번 한도, 총 8번 더한다
    int oneNumberMultiplyLimitCount = input[2];
    int multiplyTotalCount = input[1];
    int[] input2 = new int[]{2, 4, 5, 4, 6};
    int sum = 0;

    Integer[] arr = Arrays.stream(input2).boxed().toArray(Integer[]::new);
    Arrays.sort(arr, Collections.reverseOrder());

    int i = 0;
    int arrNum = 0;
    //총 더할 수 있는 카운트동안
    while (i < multiplyTotalCount) {
      int j = 0;
      //한 숫자 더하기 제한 카운트만큼 제일큰숫자, 다음숫자를 더한다
      while (j <= oneNumberMultiplyLimitCount) {
        sum += arr[arrNum];
        i++;
        j++;
        // 중간에 총 카운트가 다 채워지면 나간다.
        if (i == multiplyTotalCount) {
          break;
        }
        //두 번째로 큰 수는 한 번만 더하고 다시 제일 큰 수를 더한다.
        if (arrNum == 1) {
          arrNum = 0;
        }
        if (j == oneNumberMultiplyLimitCount) {
          arrNum = 1;
        }
      }
    }
    System.out.println(sum);
  }

}
