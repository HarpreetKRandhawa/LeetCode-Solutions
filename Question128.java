public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null)
            return 0;
        HashSet set = new HashSet<>();
        int max = 1;
        for(int n:nums)
            set.add(n);
        for(int n:nums){
            int left = n-1;
            int right = n+1;
            int count = 1;
            while(set.contains(left)){
                count++;
                set.remove(left);
                left--;
            }
            while(set.contains(right)){
                count++;
                set.remove(right);
                right++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
