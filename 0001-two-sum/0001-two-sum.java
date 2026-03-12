import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> compl = new HashMap<>();

        for (int i =0 ;i<nums.length;i++){
            Integer complIndex = compl.get(nums[i]);
            if(complIndex != null){
                return new int [] { i, complIndex} ;
            }
            compl.put(target - nums[i], i);
        }
        return new int [] { -1, -1  };
    }
    
}