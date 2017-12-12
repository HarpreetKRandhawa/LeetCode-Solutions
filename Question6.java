class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        StringBuffer[] sb = new StringBuffer[numRows];
        int j=0;
        for(int i=0; i<numRows; i++)
            sb[i] = new StringBuffer();
        while(j<s.length()){
            for(int i=0; i<numRows && j<s.length(); i++)
                sb[i].append(c[j++]);
            for(int i=numRows-2; i>0 && j<s.length(); i--)
                sb[i].append(c[j++]);
            
        }
        for(int i=1; i<numRows; i++)
            sb[0].append(sb[i]);
        return sb[0].toString();
    }
}
