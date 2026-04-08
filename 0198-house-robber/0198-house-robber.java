class Solution {
    public int rob(int[] nums) {
        int p2 = 0;
        int p1 =0;
        for(int curr : nums){
    
            int max_amount = Math.max(curr+p2,p1);
            p2 = p1;
            p1 = max_amount;
        }
        return p1;
    }
}