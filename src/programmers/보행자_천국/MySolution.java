package programmers.보행자_천국;

public class MySolution {
  int MOD = 20170805;
  public static int solution(int m, int n, int[][] cityMap) {
    //0 자동차 자유 통행 1 자동차 통행 불가 2 좌,우회전 불가.직진만 가능

//    [0, 2, 0, 0, 0, 2]
//    [0, 0, 2, 0, 1, 0]
//    [1, 0, 0, 2, 2, 0]

    //m :Y축, n: x축

    int[][] arr = new int[m][n];
    //맨 윗줄
    for (int i = 0; i < n; i++) {
      if (cityMap[0][i] == 1) {
        continue;
      }
      arr[0][i]++;
    }
    //맨 왼쪽줄
    for (int i = 1; i < m; i++) {
      if (cityMap[i][0] == 1) {
        continue;
      }
      arr[i][0]++;
    }

//    for (int i = 1; i < m; i++) {
//      for (int j = 1; j < n; j++) {
//        if (cityMap[i][j] == )
//      }
//    }



    //중간
    outer:
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        //y축 마지막 줄 먼저
        if (i == m - 1) {
          for (int k = 0; k < n; k++) {
            if (cityMap[m-1][k] == 1) {
              arr[m-1][k] = 0;
            }
          }
        }

        //1이면 현재 진행중인 y축은 그만하고 다음 행으로 넘어감
        if (cityMap[i][j] == 1) {
          arr[i][j] = 0;
          continue outer;
        }
        //0이면 위, 왼쪽의 경우의 수를 더함
        if (cityMap[i][j] == 0) {
          arr[i][j] = arr[i-1][j] + arr[i][j-1];
        }

        //2면 좀 따져봐야 하는데
        if (cityMap[i][j] == 2) {
          //만약 지금 맨 위에서 바로 아랫줄인데
          if (i == 1) {
            //바로 위인 맨 윗줄이 2였다? 그럼 지금의 왼쪽 경우의 수만 더할건데
            if (cityMap[i - 1][j] == 2) {
              arr[i][j] = arr[i][j-1];
            } else {
              arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
          } else {
            arr[i][j] = arr[i-2][j] + arr[i][j-1];
          }

          if (j == 1) {
            if (cityMap[i][j-1] == 2) {
              arr[i][j] = arr[i-1][j];
            } else {
              arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
          } else {
            arr[i][j] = arr[i][j-2] + arr[i-1][j];
          }

        }

      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        sb.append(arr[i][j] + " ");
      }
      sb.append("\n");
    }
    System.out.println(sb.toString());

    int answer = 0;
    answer = arr[m-1][n-1] % 20170805;
    return answer;
  }

  public static void main(String[] args) {
    int[][] arr = {
        {0, 2, 0, 0, 0, 2},
        {0, 0, 2, 0, 1, 0},
        {1, 0, 0, 2, 2, 0}
    };

    System.out.println(solution(3, 6, arr));
  }
}
