public class P274HIndex {
    public int hIndex(int[] citations) {
        int l = citations.length; //a citation with length l could have an hindex of l
        int[] count = new int[l+1]; //so this array is big enough to capture it

        for (int curitem : citations) {
            count[Math.min(curitem, l)]++;
        }

        int papers = 0;
        for (int i = l; i > 0; i--) {
            papers += count[i];
            if (papers >= i) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        P274HIndex p274hIndex = new P274HIndex();
       // System.out.println(p274hIndex.hIndex2(new int[]{3,0,6,1,5}));
        System.out.println(p274hIndex.hIndex(new int[]{1,3,1}));
       // System.out.println(p274hIndex.hIndex2(new int[]{2,0,0}));
    }
}
