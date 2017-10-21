class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lst = new ArrayList<Integer>();
        if(s.length() == 0 || p.length() == 0 || s == null || p == null)
            return lst;
        //Add characters to list
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(char c: p.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        //Set parameters for sliding window
        int begin=0, end=0, counter=map.size();
        while(end<s.length()){
            char t = s.charAt(end);
            if(map.containsKey())
        }
        return lst;
    }
}
