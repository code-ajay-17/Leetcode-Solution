class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum = 0;
        for (int i=0;i<k;i++) {
            int max=gifts[0];
            int maxIndex=0;
            for (int j=1;j<gifts.length;j++) {
                if (gifts[j]>max) {
                    max=gifts[j];
                    maxIndex=j;
                }
            }
            gifts[maxIndex]=(int)Math.sqrt(max);
        }
        for (int gift:gifts) {
            sum+=gift;
        }
        return sum;
    }
}