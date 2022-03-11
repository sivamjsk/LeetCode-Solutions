class Solution {
    public String toGoatLatin(String sentence) {
       		StringBuilder sb = new StringBuilder();

		String[] senarr = sentence.split(" ");

		for (int i = 0, j = i + 1; i < senarr.length; i++) {
			String temp = senarr[i];
			if (temp.length() == 1) {
				temp += "ma";
			} else if (temp.charAt(0) == 'a' || temp.charAt(0) == 'e' || temp.charAt(0) == 'i' || temp.charAt(0) == 'o'
					|| temp.charAt(0) == 'u' ||temp.charAt(0) == 'A' || temp.charAt(0) == 'E' || temp.charAt(0) == 'I' || temp.charAt(0) == 'O'
					|| temp.charAt(0) == 'U') {
				temp += "ma";
			} else {
				char t = temp.charAt(0);
				temp = temp.substring(1,temp.length());
				temp += t;
				temp += "ma";
				
			}
			while (j > 0) {
				temp += "a";
				j--;
			}
			j=i+1;
			j++;
			sb.append(temp + " ");
		}
		return sb.toString().trim();
    }
}