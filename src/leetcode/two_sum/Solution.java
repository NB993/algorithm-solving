package leetcode.two_sum;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] answer = new int[2];

    int firstNum;

    for (int i = 0; i < nums.length - 1; i++) {
      firstNum = nums[i];
      for (int j = i; j < nums.length - 1; j++) {
        if (firstNum + nums[j + 1] == target) {
          answer[0] = i;
          answer[1] = j + 1;
        }
      }
    }

    return answer;
  }
}
