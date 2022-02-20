class Solution {
    public int minPartitions(String n) {
		char max = '0';
		for(int i=0;i<n.length();i++) {
			char ch = n.charAt(i);
			max = ch > max ? ch : max;
		}
		return (max-'0');        
    }
}