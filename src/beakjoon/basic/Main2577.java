package beakjoon.basic;

import java.io.*;

public class Main2577 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());

    String abc = Integer.toString(a * b * c);
    String[] arrAbc = abc.split("");
    int[] count = new int[10];

    for (int i = 0; i < arrAbc.length; i++) {
      if (arrAbc[i].equals("0")) {
        count[0]++;
      } else if (arrAbc[i].equals("1")) {
        count[1]++;
      } else if (arrAbc[i].equals("2")) {
        count[2]++;
      } else if (arrAbc[i].equals("3")) {
        count[3]++;
      } else if (arrAbc[i].equals("4")) {
        count[4]++;
      } else if (arrAbc[i].equals("5")) {
        count[5]++;
      } else if (arrAbc[i].equals("6")) {
        count[6]++;
      } else if (arrAbc[i].equals("7")) {
        count[7]++;
      } else if (arrAbc[i].equals("8")) {
        count[8]++;
      } else if (arrAbc[i].equals("9")) {
        count[9]++;
      }
    }

    for (int i = 0; i < count.length; i++) {
      System.out.println(count[i]);
    }


  }
}
