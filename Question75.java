public class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length < 2)
            return;
        
        int[] count_array = new int[3];
        for(int i=0; i<nums.length; i++)
            count_array[nums[i]]++;
        
        int j=0;
        int k=0;
        while(j <= 2){
            if(count_array[j] != 0){
                nums[k++] = j;
                count_array[j] = count_array[j] - 1;
            }
            else
                j++;
        }
    }
}
