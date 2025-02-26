public class P55JumpGame {
    public boolean canJump(int[] nums) { //maybe we can try going from the second to last element backwards
        //and build a table of all computed results whether we can reach or not
        if (nums.length <= 1) { //the start is the end
            return true;
        } else if (nums[0] == 0) { //if the beginning of our list begins with a 0, we can't move any further.
            return false;
        }
        int goal = nums.length - 1; //we need to hit the last element
        return canjumpH(nums, goal, goal - 1);
    }

    private boolean canjumpH(int[] nums, int goal, int pos) {
        if (goal == 0) { //if we have reached all goals
            return true;
        }
        if (pos < 0) { //if we havent reached all goals but we have nothing more to read
            return false;
        }
        boolean canReachGoal = nums[pos] + pos >= goal;
        if (canReachGoal) {
            goal = pos; //if we can reach this point, we will reach the end.
        }
        pos--; //check the prior element.
        return canjumpH(nums, goal, pos);

    }

    public static void main(String[] args) {
        P55JumpGame pg = new P55JumpGame();
        System.out.println(pg.canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(pg.canJump(new int[]{3,2,1,0,4}));
        System.out.println(pg.canJump(new int[]{1,2}));
    }
}
