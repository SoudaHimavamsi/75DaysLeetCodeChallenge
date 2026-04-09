class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String>result = new ArrayList<>();
        if(digits.length() == 0 || digits == null){
            return result;
        }

        String [] arr = new String[] {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(result, new StringBuilder(), digits,0,arr);
        return result;

    }
    static void backtrack(List<String> result,StringBuilder curr,String digits,int i,String [] arr){
        if(i==digits.length()){
            result.add(curr.toString());
            return;
        }
        String letters = arr[digits.charAt(i)-'0'];

        for(char letter : letters.toCharArray()){
            curr.append(letter);
            backtrack(result,curr, digits,i+1,arr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}