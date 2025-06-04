public class Java {
  public static int removeDuplicateEnteries(int[] nums) {
    int l = 0;
    for (int r = 1; r < nums.length; r++) {
      if (nums[r] != nums[l]) {
        l++;
        nums[l] = nums[r];
      }
    }
    return l + 1;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 2 };
    int result = removeDuplicateEnteries(nums);
    System.out.println(result);
  }
}
