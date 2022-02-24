class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int output = 0;
	    for(int i = 0;i<patterns.length;i++) {
		    String temp = patterns[i];
		    if(word.contains(temp))
			    output++;
	    }
	    return output;
    }
}