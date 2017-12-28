class Solution {
    public int maximumSwap(int num) {
        
        //Convert to integer array
        String s = Integer.toString(num);
        int[] arr = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = (char)(s.charAt(i)-'0');
        }
        
        //Determine the first bigger digit in decreasing trend
        int minIndex=0, min=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1] > arr[i]){
                min = arr[i];
                minIndex = i;
                break;
            }
        }
        
        //Identify first bigger number after min
        int max = min, maxIndex = -1;
        for(int i=minIndex; i<arr.length; i++){
            if(arr[i] >= max){
                max= arr[i];
                maxIndex = i;
            }
        }
        
        //Identify if bigger number before min is smaller than max
        int swapIndex = minIndex;
        for(int i=0; i<=minIndex; i++){
            if(arr[i] < max){
                swapIndex = i;
                break;
            }
        }
        
        //Swapping
        int temp = arr[swapIndex];
        arr[swapIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
        
        //Convert int array to string
        int sum = 0;
        for(int i=arr.length-1,j=0; i>=0; i--){
            sum += (arr[j++]*Math.pow(10,i));
        }
        return sum;
    }
}
