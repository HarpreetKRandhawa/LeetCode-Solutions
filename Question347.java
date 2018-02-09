class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> lst = new ArrayList<Integer>();
        //Using PriorityQueue
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            new Comparator<Map.Entry<Integer,Integer>>(){
                @Override
                public int compare(Map.Entry<Integer,Integer> a, Map.Entry<Integer,Integer> b){
                    return b.getValue()-a.getValue();
                }
            }
        );
        
        pq.addAll(map.entrySet());
        while(k > 0){
            Map.Entry<Integer,Integer> e = pq.poll();
            lst.add(e.getKey());
            k = k-1;   
        }
        return lst;
    }
}
