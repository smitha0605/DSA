import java.util.*;

public class RearrangeArray {

    public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {2, 4, 5, -1, -3, -4};
        int[] ans = rearrangeArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}