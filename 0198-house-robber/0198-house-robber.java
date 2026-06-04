class Solution {
    public int rob(int[] nums) {
        int a = 0, b = 0;

        for (int n : nums) {
            int temp = Math.max(b, a + n);
            a = b;
            b = temp;
        }

        return b;
    }
}