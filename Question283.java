class Solution {
    public void moveZeroes(int[] a) {
        int j=0;
        for(int i=0; i<a.length; i++){
            if(a[i] != 0)
                a[j++] = a[i];
        }
        for(int k=j; k<a.length; k++){
            a[k] = 0;
        }
    }
}
