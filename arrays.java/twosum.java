
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                int i1 = map.get(complement);
                int i2 = i;
                return new int[] {
                    Math.min(i1, i2),
                    Math.max(i1, i2)
                };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 6, 2, 10, 3};
        int target1 = 7;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));

        int[] nums2 = {1, 3, 5, -7, 6, -3};
        int target2 = 0;
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
    }
}

    

