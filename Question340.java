public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        
        if(s.length() == 0 || s == null || k < 0)
            return 0;
        if(s.length() < k)
            return s.length();
            
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] array = s.toCharArray();
        int start =0;
        int max = 0;
        
        for(int i=0; i<array.length; i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }
            else if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }
            if(map.size() > k){
                max = Math.max(max,i-start);
                while(map.size() > k){
                    char t = array[start];
                    int count = map.get(t);
                    if(count == 1){
                        map.remove(t);
                    }
                    else{
                        map.put(t,map.get(t)-1);
                    }
                    start++;
                }
            }
        }
        max = Math.max(max,s.length()-start);
        return max;
    }
}
