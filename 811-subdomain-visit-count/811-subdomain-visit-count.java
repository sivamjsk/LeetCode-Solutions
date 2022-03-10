class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counts = new HashMap<>();
		for(String domain : cpdomains) {
			int hits = Integer.parseInt(domain.substring(0, domain.indexOf(" ")));
			//System.out.println(hits);
			String curr = domain.substring(domain.indexOf(" ") + 1);
			while(!curr.isEmpty()) {
				counts.put(curr,counts.getOrDefault(curr, 0) +  hits);
				int idx = curr.indexOf(".");
				if(idx != -1) {
					curr = curr.substring(idx+1);
				}else {
					curr = "";
				}
			}
		}
		List<String> result = new ArrayList<>();
		for(Map.Entry<String, Integer> itr : counts.entrySet()) {
			result.add(itr.getValue()+" "+itr.getKey());
		}
		return result;
    }
}