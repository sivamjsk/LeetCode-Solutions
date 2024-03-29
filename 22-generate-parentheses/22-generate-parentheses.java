class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        findAll("(",1,0,res,n);
        return res;
    }
    void findAll(String current,int o, int c,List<String> res, int n){
        
        if(current.length() == 2*n){
            res.add(current);
            return;
        }
        
        if(o<n) findAll(current + '(',o+1,c,res,n);
        if(c<o) findAll(current + ')',o,c+1,res,n);
    }
}