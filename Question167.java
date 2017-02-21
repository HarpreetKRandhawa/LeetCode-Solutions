//Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] results = {0,0};
        int i= 0;
        int j = numbers.length-1;
        if(numbers.length == 0){
            return results;
        }
        while(i<j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                results[0] = i+1;
                results[1] = j+1;
                break;
            }
            else
            if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return results;
    }
}
