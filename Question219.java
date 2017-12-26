class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 1)
            return false;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else{
                if(map.containsKey(nums[i])){
                    int a = map.get(nums[i]);
                    if(Math.abs(a-i) <= k)
                        return true;
                    map.put(nums[i],i);
                }    
            } 
        }
        return false;
    }
}
