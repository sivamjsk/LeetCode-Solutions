class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> res = new HashSet<String>();
		for(int i=0;i<emails.length;i++) {
			String sub = emails[i].substring(0,emails[i].indexOf('@'));
			sub = sub.replaceAll("\\.", "");
			if(sub.indexOf('+') >0)
				sub = sub.substring(0,sub.indexOf('+'));
			sub = sub + emails[i].substring(emails[i].indexOf('@'), emails[i].length());
			res.add(sub);

		}
		return res.size();
    }
}