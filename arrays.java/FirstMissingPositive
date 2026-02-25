public class FirstMissingPositive {
    
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place numbers at correct indices
        for (int i = 0; i < n; i++) {
            while (nums[i] >= 1 && nums[i] <= n 
                   && nums[nums[i] - 1] != nums[i]) {

                int correctIndex = nums[i] - 1;

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        // Step 2: Find first mismatch
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
        System.out.println(firstMissingPositive(nums)); // Output: 3
    }
}