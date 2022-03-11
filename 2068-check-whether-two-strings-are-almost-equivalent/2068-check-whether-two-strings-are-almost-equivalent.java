class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] word11 = new int[26];
		int[] word22 = new int[26];
		
		for(int i=0;i<word1.length();i++)
			word11[word1.charAt(i) - 'a']++;
		
		for(int i=0;i<word2.length();i++)
			word22[word2.charAt(i) - 'a']++;
		
		
		int count = 0;
		for(int i=0;i<word11.length;i++) {
			if(Math.abs(word11[i] - word22[i]) > 3) {
				return false;
			}
		}
		return true;
    }
}