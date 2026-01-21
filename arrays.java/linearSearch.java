 public class linearSearch {

    public static int findFirstIndex(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;   
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {2,7,4, 5, 3};
        int target = 3;

        int result = findFirstIndex(nums, target);
        System.out.println(result);
    }
}
 
    

