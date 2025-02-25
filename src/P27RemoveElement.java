public class P27RemoveElement {
    public int removeElement(int[] nums, int val) {
        //remove all vals in num inplace
        //you can change the order of elements
        //then return elements in nums not = to val.
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
