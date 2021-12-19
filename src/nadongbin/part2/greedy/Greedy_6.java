//package nadongbin.part2.greedy;
//
//import java.util.Arrays;
//import java.util.stream.IntStream;
//
//public class Greedy_6 {
//
//  public static void main(String[] args) {
//  }
//
//  public static int solution(int[] food_times, long k) {
//    int answer = 0;
//
//    int oneCycle = 0;
//    while (true) {
//      food_times = Arrays.stream(food_times).peek(e -> {if (e != 0) oneCycle++}).toArray();
//      oneCycle = food_times.length;
////      Arrays.stream(food_times).all
//      if (k / oneCycle <= 1) {
//        return (int)k;
//      }
//      if (k % oneCycle > ) {
//
//      }
//      if (oneCycle == 0) {
//        return -1;
//      }
//
//      for (int i = 0; i < oneCycle; i++) {
//        food_times[i] -= 1;
//      }
//
//    return answer;
//    }
//
//  }
//}
//
//
////class Main { // Function to remove the element
////  public static int[] removeArrayElement(int[] oddArray, int index) {
////    //array is empty or index is beyond array bounds
////    if (oddArray == null || index <0 || index>= oddArray.length) {
////      return oddArray;
////    }
////    // delete the element at specified index and return the array
////    return IntStream.range(0, oddArray.length)
////        .filter(i -> i != index)
////        .map(i ->oddArray[i]).toArray();
////  }
////  public static void main(String[] args) {
////    int[] oddArray = { 1, 3,5,7,9,11};
////    // define array of odd numbers
////    System.out.println("Original Array: " + Arrays.toString(oddArray));
////    // Print the resultant array
////    int index = 2;
////    // index at which element is to be removed
////    System.out.println("Element to be removed at index: " + index);
////    // display index
////    // function call removeArrayElement
////    oddArray = removeArrayElement(oddArray, index);
////    // Print the resultant array
////    System.out.println("Array after deleting element: " + Arrays.toString(oddArray));
////  }
////}
