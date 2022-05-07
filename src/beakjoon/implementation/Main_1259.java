package beakjoon.implementation;

import java.util.*;
import java.io.*;

public class Main_1259 { //팰린드롬수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while (!(input = br.readLine()).equals("0")) {
            int length = input.length();
            if (input.length() == 1) {
                System.out.println("yes");
                continue;
            }

            boolean noFlag = false;
            for (int i = 0; i <= length / 2; i++) {
                if (input.charAt(i) != input.charAt(length - i - 1)) {
                    noFlag = true;
                    break;
                }
            }
            if (noFlag) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }

    }

}
