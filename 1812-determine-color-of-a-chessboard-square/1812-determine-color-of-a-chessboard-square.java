class Solution {
    public boolean squareIsWhite(String coordinates) {
        int sum = (coordinates.charAt(0) - 'a')+1 + (coordinates.charAt(1) - '1')+1;
		if(sum%2 == 0) {
			return false;
		}else
			return true;
    }
}