class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0 || nums== null)
            return 0;
        int[] res = new int[nums.length];
        for(int i=0; i<res.length; i++)
            res[i] = 1;
        int i=1, j=0;
        while(i<nums.length){
            while(j<i){
                if(nums[i] > nums[j]){
                    res[i] = Math.max(res[i],1+res[j]);
                }
                j = j+1;
            }
            j = 0;
            i = i+1;
        }
        int longest = 0;
		for(int k=0; k < nums.length; k++)
			longest = Math.max(longest, res[k]);

		return longest;
    }
}
