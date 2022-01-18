package nadongbin.part2.binary_search;

import java.util.Arrays;

public class BinarySearch_3 {

    public static void main(String[] args) {
        int M = 6;
        int[] arr = new int[]{19, 15, 10, 17};
        int start = 0;
        int end = arr[arr.length - 1];
        int sum = 0;
        int midCutHeight = 0;
        int result = -1;

        while (start <= end) { //떡 자르는 길이 높이고 낮추고를 계속 반복함. 무조건 start가 end와 같아질 때까지 수행함.
            midCutHeight = (start + end) / 2;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] - midCutHeight > 0) {
                    sum += arr[i] - midCutHeight;
                }
            }
            if (sum < M) {
                end = midCutHeight - 1;
                System.out.println("sum < M");
                System.out.println("start: " + start);
                System.out.println("end : " + end);
            } else {
                System.out.println("sum >= M");
                start = midCutHeight + 1; //떡 길이 합계가 M보다 크면 자르는 길이를 줄여봄.
                result = midCutHeight; //자르는 높이를 높여도 합이 Mqㅗ다 더 크면 계속 갱신해 나간다.
                System.out.println("start: " + start);
                System.out.println("end : " + end);
            }
            sum = 0;
        }
        System.out.println(result);
    }
}
