public class P26RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        //nums in ascending order
        //remove duplicates in place, but keep nums ascending
        //return how many uniques there are
        if (nums.length == 0) {
            return 0;
        }
        int consider = nums[0];
        int k = 1; //at least one unique element in nonempty
        for (int i = 1; i < nums.length; i++) {
            if (consider != nums[i]) {
                consider = nums[i];
                nums[k] = consider;
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        P26RemoveDuplicates p26RemoveDuplicates = new P26RemoveDuplicates();
        System.out.println(p26RemoveDuplicates.removeDuplicates(new int[]{1,2,2,3,4}));
    }
}
