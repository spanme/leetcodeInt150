public class P189RotateArray {
//    public void rotate(int[] nums, int k) { //too slow O(k*n), slow for big k.
//        int n;
//        //pre: k >=0;
//        //rotate the array by k steps, cyclic shift
//        if (nums.length == 0) {
//            return;
//        } else {
//            n = nums.length - 1;
//        }
//        k = k % (n + 1); //modulo arithmetic to reduce computations.
//        while (k > 0) {
//            int last = nums[n];
//            for (int i = n; i > 0; i--) { //length - 2 for penultimate element
//                nums[i] = nums[i - 1];
//            }
//            nums[0] = last;
//            k--;
//        }
//    }
    public void rotate(int[] nums, int k) {
        int n = nums.length - 1;
        k = k % (n + 1);
        reverse(nums,0,n);
        reverse(nums,0,k - 1);
        reverse(nums,k, n);
    }
    private void reverse(int[] nums, int left, int right) { //two pointer reverse
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] mything = new int[] {1,2,3,4,5,6,7};
        P189RotateArray p189RotateArray = new P189RotateArray();
        p189RotateArray.rotate(mything, 3);
        for (int i : mything) {
            System.out.println("i: " + i);
        }
    }
}
