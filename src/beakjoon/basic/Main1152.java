package beakjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Main1152 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = new StringTokenizer(br.readLine()).countTokens();

    System.out.println(count);

  }
}
