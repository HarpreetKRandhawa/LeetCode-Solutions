class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || nums == null)
            return new int[0];
        
        int len = nums.length, j=0;
        int[] res = new int[len-k+1];
        
        Deque<Integer> dq = new LinkedList<Integer>();
        int i;
        for(i=0; i<k; i++){
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        for(; i<len; i++){
            res[j++] = nums[dq.peek()];
            while(!dq.isEmpty() && dq.peek() <= i-k)
                dq.poll();
            while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        res[j] = nums[dq.peek()];
        return res;
    }
}
