package nadongbin.part2.binary_search;

import java.util.Arrays;

public class BinarySearch_2 {

    public static void main(String[] args) {
        int N = 5;
        int[] parts = new int[]{8, 3, 7, 9, 2};

        Arrays.sort(parts);

        int[] target = new int[]{5, 7, 9};


        for (int i = 0; i < target.length; i++) {
            if (findPart(parts, target[i], 0, parts.length - 1)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }



    }

    public static boolean findPart(int[] arr, int findValue, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            System.out.println(mid);
            if (arr[mid] == findValue) {
                return true;
            } else if (arr[mid] > findValue) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

}
