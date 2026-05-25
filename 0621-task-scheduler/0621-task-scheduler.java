class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char c : tasks) {
            freq[c - 'A']++;
        }

        int max = 0;

        for (int f : freq) {
            max = Math.max(max, f);
        }

        int maxCount = 0;

        for (int f : freq) {
            if (f == max) {
                maxCount++;
            }
        }

        return Math.max(tasks.length, (max - 1) * (n + 1) + maxCount);
    }
}