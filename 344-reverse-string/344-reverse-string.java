class Solution {
    public void reverseString(char[] s) {
        int start = 0;
		int end = s.length-1;
		
		while(!(start > end)) {
			char st = s[start];
			char en = s[end];
			s[start] = en;
			s[end] = st;
			start++;
			end--;
		}
    }
}