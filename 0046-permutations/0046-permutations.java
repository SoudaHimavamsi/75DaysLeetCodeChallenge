class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        backtrack(permutations, new ArrayList<>(), nums);
        return permutations;
    }

    public void backtrack(List<List<Integer>> r, ArrayList<Integer> t, int[] nums) {
        if (t.size() == nums.length) {
            r.add(new ArrayList<>(t));
            return;
        }
        for (int num : nums) {
            if (t.contains(num)) {
                continue;
            }
            t.add(num);
            backtrack(r, t, nums);
            t.remove(t.size() - 1);
        }
    }
}