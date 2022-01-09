package nadongbin.part2.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

  private int score;
  private String name;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  @Override
  public int compareTo(Student o) { // implements Comparable { ...로 할시 compareTo(Object o)
    return this.score - o.score;
  }

  public int getScore() {
    return score;
  }

  public String getName() {
    return name;
  }
}

public class Sort_3 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    List<Student> students = new ArrayList<>();
    String name;
    int score;
    String[] split;

    for (int i = 0; i < N; i++) {
      split = br.readLine().split(" ");
      name = split[0];
      score = Integer.parseInt(split[1]);
      students.add(new Student(name, score));
    }

    Collections.sort(students);

    for (int i = 0; i < students.size(); i++) {
      System.out.println(students.get(i).getName() + ": " + students.get(i).getScore());
    }
  }

}
