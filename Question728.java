class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<Integer>();
        for(int i=left; i<=right; i++){
            boolean num = divideHelper(i);
            if(num)
                l.add(i);
        }
        return l;
    }
    public boolean divideHelper(int num){
        int dup = num;
        while(num > 0){
            int divisor = num%10;
            if(divisor == 0 || dup%divisor != 0)
                return false;
            num = num/10;
        }
        return true;
    }
}
