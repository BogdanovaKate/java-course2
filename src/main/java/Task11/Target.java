package Task11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Target {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> twoSum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            twoSum.put(nums[i], i);
            Integer a = twoSum.get(target - nums[i]);
            if (a != null) {
                return new int[]{i, a};
            }
        }
        throw new RuntimeException("Не найдена сумма");
    }

    public static void main(String[] args) {
        Target target = new Target();
        int[] nums = new int[]{10, 50, 10, 60, 50};
        System.out.println(Arrays.toString(target.twoSum(nums, 100)));

    }
}

