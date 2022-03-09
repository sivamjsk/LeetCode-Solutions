class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
       String pattern_norm = normalize(pattern);
		
		System.out.println(pattern_norm);
		List<String> list = new ArrayList<>();
		for(int i=0;i<words.length;i++) {
			if(pattern_norm.equals(normalize(words[i]))) {
				list.add(words[i]);
			}
		}
        return list;
    }
    
    
    private static String normalize(String pattern) {
		Map<Character,Integer> map = new HashMap<>();
		String result = "";
		for(int i=0;i<pattern.length();i++) {
			map.putIfAbsent(pattern.charAt(i), map.size());
			result += map.get(pattern.charAt(i));
		}
		return result;
	}
}