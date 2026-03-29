class Solution {
    public boolean isValid(String s) {
        Stack<Character> cha = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '[' || c== '{' || c=='('){
                cha.push(c);
            }
            else{
                if(cha.isEmpty()){
                    return false;
                }
                char top = cha.pop();

                if((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')  ){
                    return false;
                }
            }
        }
        return cha.isEmpty();
    }
}