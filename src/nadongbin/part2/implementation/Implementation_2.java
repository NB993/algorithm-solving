package nadongbin.part2.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Implementation_2 {

  public static void main(String[] args) throws IOException {
    int horizontalMin = 'c';
    int verticalMin = 3;
    int horizontalMax = 'f';
    int verticalMax = 6;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    String[] place = br.readLine().split("");
    String[] place = {"e", "5"};
    int horizontal = place[0].charAt(0);
    int vertical = Integer.parseInt(place[1]);



    int possibleCount = 8;
    if (horizontal <= horizontalMin || horizontal >= horizontalMax) {
      if (horizontalMin - horizontal == 2) possibleCount--;
      if (horizontal - horizontalMax == 2) possibleCount--;
      possibleCount -= 2;
    }
    if (vertical <= verticalMin || vertical >= verticalMax) {
      if (verticalMin - vertical == 2) possibleCount--;
      if (vertical - verticalMax == 2) possibleCount--;
      possibleCount -= 2;
    }

    System.out.println(possibleCount);
  }

}
