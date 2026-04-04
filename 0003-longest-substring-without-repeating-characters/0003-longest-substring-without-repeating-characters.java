class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;

        Set<Character> set = new HashSet<>();  
        int L = 0;
        for(int R = 0;R<s.length();R++){
            while(set.contains(s.charAt(R))){
                set.remove(s.charAt(L));
                L++;
            }
            set.add(s.charAt(R));
            res = Math.max(res,R-L+1);
        }
        return res;
    }
}