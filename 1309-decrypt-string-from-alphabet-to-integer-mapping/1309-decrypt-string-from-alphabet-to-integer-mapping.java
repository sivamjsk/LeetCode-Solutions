class Solution {
    public String freqAlphabets(String s) {
        Map<String,Character> map = new HashMap<>();
		char index = 'a';
		for(int i=1;i<=9;i++) {
			String x = String.valueOf(i);
			map.put(x, map.getOrDefault(i, index++));
		}
		for(int i=10;i<=26;i++) {
			String x = String.valueOf(i);
			x = x + '#';
			map.put(x, map.getOrDefault(i, index++));
		}
		//System.out.println(map);
		StringBuilder sb = new StringBuilder();
		int ptr = 0;
		while(ptr < s.length()) {
			if((ptr+2 < s.length()) && (s.charAt(ptr+2) == '#')) {
				String sub = s.substring(ptr,ptr+3);
				sb = sb.append(map.get(sub));
				ptr+=3;
			}
			else {
				String sub = s.substring(ptr,ptr+1);
				sb = sb.append(map.get(sub));
				ptr+=1;
			}
		}
        return sb.toString();
		
    }
}