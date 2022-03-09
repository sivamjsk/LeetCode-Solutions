class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

		int i1 = 0, i2 = 0;

		while (i1 < word1.length() && i2 < word2.length()) {

			sb.append(word1.charAt(i1++));
			sb.append(word2.charAt(i2++));

		}
		
		while(i1 < word1.length())
			sb.append(word1.charAt(i1++));
		
		
		while(i2 < word2.length())
			sb.append(word2.charAt(i2++));
		
		return sb.toString();
    }
}