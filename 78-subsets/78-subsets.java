class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        GenerateSubset(0,nums,new ArrayList<>(),res);
        return res;
    }
    private static void GenerateSubset(int index, int[] nums, List<Integer> curr, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		res.add(new ArrayList(curr));
		
		for(int i=index;i<nums.length;i++) {
			curr.add(nums[i]);
			GenerateSubset(i+1,nums,curr,res);
			curr.remove(curr.size()-1);
		}
		
	}
}