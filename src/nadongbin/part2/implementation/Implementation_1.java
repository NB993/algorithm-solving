package nadongbin.part2.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Implementation_1 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int N = Integer.parseInt(br.readLine());
//    String[] dirrections = br.readLine().split(" ");

    int x = 1;
    int y = 1;

    int N = 5;
    String[] dirrections = {"R", "R", "R", "U", "D", "D"};

    for (int i = 0; i < dirrections.length; i++) {
      if (dirrections[i] == "L") {
        x -= 1;
      } else if (dirrections[i] == "R") {
        x += 1;
      } else if (dirrections[i] == "U") {
        y -= 1;
      } else if (dirrections[i] == "D") {
        y += 1;
      }

      if (x == 0) {
        x = 1;
      } else if (x > N) {
        x = N;
      }
      if (y == 0) {
        y = 1;
      } else if (y > N) {
        y = N;
      }
    }

    System.out.println(y + ", " + x);
  }
}
