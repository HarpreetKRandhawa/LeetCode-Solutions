class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        if(s == null || len == 0)
            return -1;
        Set<Character> set = new HashSet<Character>();
        List<Character> lst = new ArrayList<Character>();
        for(Character c: s.toCharArray()){
            if(set.contains(c))
                continue;
            else if(lst.contains(c)){
                lst.remove(c);
                set.add(c);
            }
            else
                lst.add(c);
        }
        int index = lst.size() > 0 ? s.indexOf(lst.get(0)) : -1;
        return index;
    }
}
