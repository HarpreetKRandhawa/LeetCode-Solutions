public class Solution {
    public int reverse(int x) {
        long rev = 0;
        long copy = x;
        while(copy != 0){
            rev = rev * 10 + copy % 10;
            copy = copy / 10;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;
        return (int)rev;
    }
}
