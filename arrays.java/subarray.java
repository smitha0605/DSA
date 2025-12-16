

public class subarray {
    public int longestSubarray(int[] nums, int k) {

        if (nums == null || k <= 0 || nums.length < k) {
            return 0;
        }

        int n = nums.length;
        int current = 0;

        for (int i = 0; i < k; i++) {
            current += nums[i];
        }

        int maxx = current;

        for (int i = 1; i <= n - k; i++) {
            current = current - nums[i - 1] + nums[i + k - 1];
            if (current > maxx) {
                maxx = current;
            }
        }
        return maxx;
    }

    public static void main(String[] args) {
       subarray ls = new subarray();

        int[] nums = {1, 1, 0, 1, 1, 0, 1};
        int k = 2;

        int result = ls.longestSubarray(nums, k);
        System.out.println("The sum of the max subarray of length " + k + " is: " + result);
    }
}
