public class SearchInsertionPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 7};
        int target = 5;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                System.out.println(mid);
                return;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(left);
    }
}
