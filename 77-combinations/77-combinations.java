class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        generateSubsets(1,n,new ArrayList(),res,k);
        return res;
        
    }
    void generateSubsets(int start,int n,List<Integer> curr,List<List<Integer>>  res,int k){
        
        if(curr.size()==k){
            res.add(new ArrayList(curr));
            return;
        }
        for(int i=start;i<=n;i++){
            curr.add(i);
            generateSubsets(i+1,n,curr,res,k);
            curr.remove(curr.size()-1);
        }
    }
}