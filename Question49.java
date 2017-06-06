public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String str:strs){
            char[] array = new char[26];
            for(int i=0; i<str.length(); i++){
                array[str.charAt(i) - 'a']++;
            }
            String ns = new String(array);
            if(map.containsKey(ns)){
                map.get(ns).add(str);
            }
            else{
                ArrayList<String> a1 = new ArrayList<String>();
                a1.add(str);
                map.put(ns,a1);
            }
        }
        res.addAll(map.values());
        return res;
    }
}
