package nadongbin.part2.sort;

import java.util.*;
import java.io.*;

public class Sort_4 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] firstLine = br.readLine().split(" ");
    int N = Integer.parseInt(firstLine[0]);
    int K = Integer.parseInt(firstLine[1]);

    String[] aStrings = br.readLine().split(" ");
    String[] bStrings = br.readLine().split(" ");
    Integer[] arrA = new Integer[N];
    Integer[] arrB = new Integer[N];
    for (int i = 0; i < N; i++) {
      arrA[i] = Integer.parseInt(aStrings[i]);
      arrB[i] = Integer.parseInt(bStrings[i]);
    }

    Arrays.sort(arrA);
    Arrays.sort(arrB, Collections.reverseOrder()); //역순 정렬이 가능하도록 배열을 래퍼타입으로 선언 사용.

    int temp = 0;
    for (int i = 0; i < K; i++) {
      if (arrA[i] < arrB[i]) {
        temp = arrB[i];
        arrB[i] = arrA[i];
        arrA[i] = temp;
      }
    }
  }
}
