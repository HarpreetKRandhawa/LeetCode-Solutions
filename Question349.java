class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setA = new HashSet<Integer>();
        Set<Integer> setB = new HashSet<Integer>();
        for(Integer num1: nums1)
            setA.add(num1);
        for(Integer num2: nums2){
            if(setA.contains(num2))
                setB.add(num2);
        }
        int[] res = new int[setB.size()];
        int i=0;
        for(Integer num: setB)
            res[i++] = num;
        return res;
    }
}
