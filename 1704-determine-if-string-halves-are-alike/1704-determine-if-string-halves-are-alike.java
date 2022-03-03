class Solution {
    public boolean halvesAreAlike(String s) {
        String shf = s.substring(0,s.length()/2);
		String shl = s.substring(s.length()/2,s.length());
		int fcount = 0,lcount = 0;
		for(int i=0;i<shf.length();i++) {
			if(shf.charAt(i) == 'a' || shf.charAt(i) == 'e' || shf.charAt(i) == 'i' || shf.charAt(i) == 'o' || shf.charAt(i) == 'u' || 
					shf.charAt(i) == 'A' || shf.charAt(i) == 'E' || shf.charAt(i) == 'I' || shf.charAt(i) == 'O' || shf.charAt(i) == 'U')
				fcount++;
		}
		for(int i=0;i<shl.length();i++) {
			if(shl.charAt(i) == 'a' || shl.charAt(i) == 'e' || shl.charAt(i) == 'i' || shl.charAt(i) == 'o' || shl.charAt(i) == 'u' || 
					shl.charAt(i) == 'A' || shl.charAt(i) == 'E' || shl.charAt(i) == 'I' || shl.charAt(i) == 'O' || shl.charAt(i) == 'U')
				lcount++;
		}
		if(fcount == lcount)
			return true;
		else
			return false;
    }
}