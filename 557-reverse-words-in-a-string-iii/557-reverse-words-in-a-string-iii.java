class Solution {
    public String reverseWords(String s) {
        String[] sarr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<sarr.length;i++) {
			StringBuilder temp = new StringBuilder();
			temp.append(sarr[i]);
			temp.reverse();
			sb.append(temp);
			sb.append(" ");	
		}
		return sb.toString().trim();
    }
}