class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 1;
        long right = (long)1e18;
        long ans = right;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (canReduce(mid, mountainHeight, workerTimes)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    boolean canReduce(long time, int height, int[] workers) {
        long total = 0;
        for (int t : workers) {
            long low = 0, high = height;
            while (low <= high) {
                long mid = (low + high) / 2;
                long need = (long)t * mid * (mid + 1) / 2;
                if (need <= time)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            total += high;
            if (total >= height)
                return true;
        }
        return false;
    }
}