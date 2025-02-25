public class P80RemoveDuplicate2 {
    public int removeDuplicates(int[] nums) {
        //nums in ascending order, remove duplicates in place but they can appear twice at most
        //same as P26 otherwise
        if (nums.length == 0) {
            return 0;
        }

        int seen = 1; //seen 0 times.
        int consider = nums[0];
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (consider != nums[i]) {
                seen = 0;
            }
            if (seen < 2) {
                seen++;
                consider = nums[i];
                nums[k] = consider;
                k++;
            }
        }
        for (int num : nums) {
            System.out.println("num is: " + num);
        }
        return k;
    }
        public static void main(String[] args) {
            P80RemoveDuplicate2 p80RemoveDuplicates = new P80RemoveDuplicate2();
            System.out.println(p80RemoveDuplicates.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
        }

}
