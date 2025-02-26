public class P55JumpGame {
    public boolean canJump(int[] nums) {

        if (nums.length <= 1) { // we are at the end
            return true;
        }
        int goal = nums.length - 1; //goal is last


        for (int pos = nums.length - 2; pos >= 0; pos--) { //penultimate element
            if (nums[pos] + pos >= goal) { //can i reach goal
                goal = pos; //shift goalposts
            }
        }
        return goal == 0; //once we reach the first element, defined starting point, then we are true. else not.
    }

       public static void main(String[] args) {
        P55JumpGame pg = new P55JumpGame();
        System.out.println(pg.canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(pg.canJump(new int[]{3,2,1,0,4}));
        System.out.println(pg.canJump(new int[]{1,2}));
    }
}
