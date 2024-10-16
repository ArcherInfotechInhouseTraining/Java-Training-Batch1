public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArray[(i + k) % n] = nums[i];
        }
        System.arraycopy(rotatedArray, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
