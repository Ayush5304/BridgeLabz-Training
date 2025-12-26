public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3, 4, 2};
        int val = 2;

        int k = removeElement(nums, val);

        System.out.println("Number of elements not equal to " + val + k);
        System.out.print("Updated array");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
