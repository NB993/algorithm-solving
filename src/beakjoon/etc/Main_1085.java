package beakjoon.etc;

import java.util.*;
import java.io.*;

public class Main_1085 { //직사각형에서 탈출

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int answer = Math.min((w - x), (h -y));
        answer = Math.min(answer, x);
        answer = Math.min(answer, y);

        System.out.println(answer);
    }
}
