package studying_etc;

public class QuickSort {

  public static void main(String[] args) {
    int[] arr = {3,9,4,7,5,0,1,6,8,2};
    printArray(arr);
    quickSort(arr);
    printArray(arr);
  }
  static void quickSort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }
  static void quickSort(int[] arr, int start, int end) {
    int part2 = partition(arr, start, end); // ㅋㅁ나눈 오른쪽 파티션의 첫 번째 인덱스를 받아옴.
    if (start < part2 - 1) { //왼쪽 파티션의 시작점과 오른쪽 파티션의 시작점이 바로 붙어있는 경우 false. 더 이상 나누지 않아야 하니까.
      quickSort(arr, start, part2 - 1);
    }
    if (part2 < end) {
      quickSort(arr, part2, end);
    }
  }

  private static int partition(int[] arr, int start, int end) {
    int pivot = arr[(start + end) / 2]; //배열의 중간 요소를 기준값으로 지정한다

    while (start <= end) {
      while (arr[start] < pivot) start++; //기준값보다 start포인터 값이 작으면 아무 작업 안하고 포인터만 오른쪽으로 이동시킨다
      while (arr[end] > pivot) end--; //기준값보다 end포인터 값이 크면 아무 작업 안하고 포인터만 왼쪽으로 이동시킨다

      //이제 기준값보다 start값이 크거나, 기준값보다 end포인터 값이 작은 경우가 됐는데 이때
      if (start <= end) { //start포인터 인덱스가 end포인터 인덱스보다 같거나 작은 경우라면 swap하는 게 의미가 있고, 가능한 상태니까
        swap(arr, start, end); //start포인터와 end포인터가 가리키고 있는 값을 swap한다.
        start++; //그리고 다시 포인터를
        end--; //각각 이동시켜준다.
      }
    }
    //start포인터가 end포인터를 넘어간 경우 왼쪽 파티션과 오른쪽 파티션을 한번 쭉 돈 거니까 while문을 나가고,
    return start; // "오른쪽 파티션"의 start포인터(첫 번째 인덱스)를 리턴한다.
  }

  private static void swap(int[] arr, int start, int end) {
    int tmp = arr[start];
    arr[start] = arr[end];
    arr[end] = tmp;
  }
  static void printArray(int[] arr) {
    for (int data : arr) {
      System.out.print(data + ", ");
    }
    System.out.println();
  }


}
