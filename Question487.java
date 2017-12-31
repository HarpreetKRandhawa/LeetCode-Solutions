class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int zL=0, zR=0, max=0;
        for(int i=0; i<nums.length; i++){
            zR++;
            if(nums[i] == 0){
                zL = zR;
                zR = 0;
            }
            max = Math.max(max,zR+zL);
        }
        return max;
    }
}
