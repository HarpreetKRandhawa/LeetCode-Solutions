public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> elements = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return elements;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            max = Math.max(max,entry.getValue());
        }
        ArrayList<Integer>[] arr = (ArrayList<Integer>[]) new ArrayList[max+1];
        for(int i=1; i<=max; i++){
            arr[i]=new ArrayList<Integer>();
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int count = entry.getValue();
            int number = entry.getKey();
            arr[count].add(number);
        }
        for(int j=max; j>=1; j--){
            if(arr[j].size()>0){
                for(int a: arr[j]){
                    elements.add(a);
                    if(elements.size() == k)
                        break;
                }
            }
            if(elements.size() == k){
                break;
            }
        }
        return elements;
    }
}
