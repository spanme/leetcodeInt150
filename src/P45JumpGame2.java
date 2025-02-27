public class P45JumpGame2 {

    public int jump(int[] nums) {

        //given an array of nums, find the minimum amount of jumps necessary to reach the end.
        //PRE: WE CAN REACH THE END FOR SURE
        //the jump distance is <= to the number at the position of the array

        if (nums.length <= 1) return 0;

        int ontop = 0, endpos = 0, jumps = 0;
        while (endpos < nums.length - 1) {
            int maxreach = 0;
            for (int i = ontop; i <= endpos; i++) {
                maxreach = Math.max(maxreach, i + nums[i]);
            }
            ontop = endpos + 1;
            endpos = maxreach;
            jumps++;
        }

        return jumps;
    }

    public static void main(String[] args) {
        P45JumpGame2 game = new P45JumpGame2();
        System.out.println(game.jump(new int[]{2, 3, 1, 1, 4}));
//        System.out.println(game.jump(new int[]{2, 3, 0, 1, 4}));
//        System.out.println(game.jump(new int[]{2, 2, 1, 1, 4}));
    }
}
