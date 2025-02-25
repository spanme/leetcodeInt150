import java.util.Arrays;

class mergeTwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //PRE: nums1, nums2 sorted in ascending order.
        //m = elements in nums1, n for nums2.
        //task: merge both into an ascending order list, store it into nums1.
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }


    public static void main(String[] args) {
        mergeTwoSortedArray obj = new mergeTwoSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        obj.merge(nums1,3,nums2,3);
        for (int i : nums1) {
            System.out.print(i + ",");
        }
    }

}


