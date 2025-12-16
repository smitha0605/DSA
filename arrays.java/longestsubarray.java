 import java.util.*;

public class longestsubarray {

    public static int longestSubarray(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            if (prefixSum == k) {
                maxLength = i + 1;
            }

            if (map.containsKey(prefixSum - k)) {
                int length = i - map.get(prefixSum - k);
                maxLength = Math.max(maxLength, length);
            }

            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {10, -4, 2, -1, 1, 9};
        int k = 15;
        System.out.println(longestSubarray(nums, k));
    }
}
 
    

