import java.util.*;

class Solution {
    public static int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> union = new ArrayList<>();

        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++;
                j++;
            } 
            else if (nums1[i] < nums2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++;
            } 
            else {
                if (union.size() == 0 || union.get(union.size() - 1) != nums2[j]) {
                    union.add(nums2[j]);
                }
                j++;
            }
        }

        
        while (i < nums1.length) {
            if (union.size() == 0 || union.get(union.size() - 1) != nums1[i]) {
                union.add(nums1[i]);
            }
            i++;
        }

        while (j < nums2.length) {
            if (union.size() == 0 || union.get(union.size() - 1) != nums2[j]) {
                union.add(nums2[j]);
            }
            j++;
        }

        
        int[] result = new int[union.size()];
        for (int k = 0; k < union.size(); k++) {
            result[k] = union.get(k);
        }

        return result;
    }

public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};

        int[] union = unionArray(nums1, nums2);

        System.out.println("Union of arrays:");
        System.out.println(Arrays.toString(union));
    }
}

