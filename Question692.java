class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        List<String> res = new ArrayList<String>();
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String w:words){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(
            new Comparator<Map.Entry<String,Integer>>(){
                public int compare(Map.Entry<String,Integer> a, Map.Entry<String,Integer> b){
                    if(a.getValue() == b.getValue())
                        return a.getKey().compareTo(b.getKey());
                    else
                        return b.getValue() - a.getValue();
                }
            }
        );
        
        pq.addAll(map.entrySet());
        while(k != 0){
            Map.Entry<String,Integer> e = pq.poll();
            res.add(e.getKey());
            k = k-1;
        }
        
        return res;
    }
}
