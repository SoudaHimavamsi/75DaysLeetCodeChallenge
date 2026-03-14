class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char arr [] = s.toCharArray();

        char reverse [] = new char[arr.length];

        for(int i = 0;i<arr.length;i++){
            reverse [i] = arr[arr.length -1 - i];
        }

        if(Arrays.equals(arr,reverse)){
            return true;
        }
        return false;
    }
}