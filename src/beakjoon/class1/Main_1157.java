package beakjoon.class1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main_1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] chars = sc.nextLine().split("");
        Map<String, Integer> result = new HashMap<>();


        for (int i = 0; i < chars.length; i++) {
            if (!result.containsKey(chars[i].toUpperCase())) {
                result.put(chars[i].toUpperCase(), 1);
                continue;
            }
            result.put(chars[i].toUpperCase(), result.get(chars[i].toUpperCase()) + 1);
        }



    }
}
