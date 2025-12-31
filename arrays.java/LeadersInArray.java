import java.util.*;
public class LeadersInArray {
    public static List<Integer> findLeaders(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > max) {
                leaders.add(nums[i]);
                max = nums[i];
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        System.out.println(findLeaders(nums));
    }
}