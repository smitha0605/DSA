public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 3, 1, 4};
        int unique = singleNumber(nums);
        System.out.println("The number that appears once is: " + unique);
    }
}
