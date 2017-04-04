//Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

public class Solution {
    public int findComplement(int num) {
        int n1 = (Integer.highestOneBit(num) << 1) - 1;
        return (num^n1);
    }
}
