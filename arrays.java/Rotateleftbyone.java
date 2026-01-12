import java.util.Arrays;

public class Rotateleftbyone {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,6,7};

        int first = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        nums[nums.length - 1] = first;

        System.out.println(Arrays.toString(nums));
    }
}
