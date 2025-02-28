import java.util.Arrays;

public class P238ProductOfArrayNoSelf {
    public int[] productExceptSelf(int[] nums) {
        //where prod[i] = num[i] multiplied by all other elements in nums.
        //algo must run in O(n), so we cant just for loop twice as n^2
        //cannot use division, i.e. get multiple of whole thing then just divide by the number you are

        int[] prod = new int[nums.length];
        int prefix = 1, suffix = 1;
        if (nums.length <= 1) {
            return prod;
        }
        for (int i = 0; i < nums.length; i++) {
            prod[i] = prefix;
            prefix  *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            prod[i] *= suffix;
            suffix *= nums[i];
        }
        return prod;
    }

    public static void main(String[] args) {
        P238ProductOfArrayNoSelf p = new P238ProductOfArrayNoSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = p.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
