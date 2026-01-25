import java.util.*;
public class majorityElement2 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 1, 3, 2};

        int n = nums.length;

        int cand1 = 0, cand2 = 0;
        int count1 = 0, count2 = 0;

      
        for (int num : nums) {
            if (num == cand1) {
                count1++;
            } else if (num == cand2) {
                count2++;
            } else if (count1 == 0) {
                cand1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                cand2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == cand1) count1++;
            else if (num == cand2) count2++;
        }

        
        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(cand1);
        if (count2 > n / 3) result.add(cand2);

        System.out.println(result);
    }
}    

