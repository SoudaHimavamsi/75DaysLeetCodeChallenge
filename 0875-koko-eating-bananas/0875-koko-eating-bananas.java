public class Solution {
    public int minEatingSpeed(int[] piles, int hr) {
        int left = 1;  
        int right = Arrays.stream(piles).max().getAsInt();
        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, hr, mid)) {
                ans = mid;     
                right = mid - 1;
            } else {
                left = mid + 1; 
            }
        }
        return ans;
    }

    public boolean canFinish(int[] piles, int hr, int k) {
        long hours = 0;
        for (int pile : piles) {
            hours += pile / k;
            if (pile % k != 0) hours++;
        }
        return hours <= hr;
    }
}