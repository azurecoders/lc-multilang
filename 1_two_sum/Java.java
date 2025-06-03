import java.util.HashMap;

public class Java {
  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int x = target - nums[i];
      if (map.containsKey(x)) {
        return new int[] { map.get(x), i };
      }
      map.put(nums[i], i);
    }
    return new int[] {};
  }

  public static void main(String[] args) {
    int[] result = twoSum(new int[] { 2, 4, 3 }, 7);
    System.out.println("[" + result[0] + "," + result[1] + "]");
  }
}
